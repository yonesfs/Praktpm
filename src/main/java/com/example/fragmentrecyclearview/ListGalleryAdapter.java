package com.example.fragmentrecyclearview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListGalleryAdapter extends RecyclerView.Adapter<ListGalleryAdapter.ViewHolder>{
    private Context context;
    private ArrayList<ListGalleryModel> listGalleryModels;

    public ListGalleryAdapter(ArrayList<ListGalleryModel> listData, Context context){
        this.context = context;
    }

    public ArrayList<ListGalleryModel> getListGalleryModels() {
        return listGalleryModels;
    }

    public void setListGalleryModels(ArrayList<ListGalleryModel> listGalleryModels) {
        this.listGalleryModels = listGalleryModels;
    }

    @NonNull
    @Override
    public ListGalleryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gallery,viewGroup,false);
        return new ViewHolder(itRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListGalleryAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getListGalleryModels().get(i).getMountPhoto()).into(viewHolder.ivPhoto);
        viewHolder.tvName.setText(getListGalleryModels().get(i).getMountName());
        viewHolder.bShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getListGalleryModels().get(i).getMountDetail());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent,"Send To"));
            }
        });

        viewHolder.bDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("photo", getListGalleryModels().get(i).getMountPhoto());
                intent.putExtra("nama", getListGalleryModels().get(i).getMountName());
                intent.putExtra("detail", getListGalleryModels().get(i).getMountDetail());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListGalleryModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPhoto;
        private TextView tvName;
        private Button bShare;
        private Button bDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto = itemView.findViewById(R.id.IV);
            tvName = itemView.findViewById(R.id.name_mount);
            bShare = itemView.findViewById(R.id.btn_share);
            bDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
