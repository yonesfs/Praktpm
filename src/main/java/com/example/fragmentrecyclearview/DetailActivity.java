package com.example.fragmentrecyclearview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvDetail, tvNameDetail;
    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivPhoto = findViewById(R.id.detail_image);
        tvNameDetail = findViewById(R.id.detail_advantage);
        tvDetail = findViewById(R.id.detail_advantage);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("photo") && getIntent().hasExtra("nama") && getIntent().hasExtra("detail")){
            int photoMount = getIntent().getIntExtra("photo", 0);
            String nameMount = getIntent().getStringExtra("nama");
            String detailMount = getIntent().getStringExtra("detail");

            setDataActivity(photoMount, nameMount, detailMount);
        }
    }

    private void setDataActivity(int photoMount, String nameMount, String detailMount) {
        Glide.with(this).asBitmap().load(photoMount).into(ivPhoto);
        tvNameDetail.setText(nameMount);
        tvDetail.setText(detailMount);
    }
}