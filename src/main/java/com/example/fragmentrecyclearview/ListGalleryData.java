package com.example.fragmentrecyclearview;

import java.util.ArrayList;

public class ListGalleryData {
    private static String[]
            title = new String[]{"Gunung Marapi",
            "Gunung Singgalang","Gunung Talamau",
            "Gunung Sinabung","Gunung Kerinci"};

    private static int[] photo = new
            int[]{R.drawable.kerinci,R.drawable.marapi,R.drawable.sinabung,
            R.drawable.singgalang,R.drawable.talamau};

    private static String[] detail = new String[]{
            "Gunung Marapi (juga dikenal sebagai Merapi atau Berapi) adalah gunung berapi yang terletak di Sumatra Barat, Indonesia. Gunung ini tergolong gunung yang paling aktif di Sumatra. Terletak dalam kawasan administrasi Kabupaten Agam. Gunung ini dapat juga dilihat dari kota Bukittinggi, kota Padangpanjang dan kabupaten Tanah Datar dan memiliki ketinggian 2.891 m. Gunung Marapi sudah meletus lebih dari 50 kali sejak akhir abad 18.",
            "Gunung Singgalang merupakan sebuah gunung yang terdapat di provinsi Sumatra Barat, Indonesia dengan ketinggian 2,877 meter.",
            "Gunung Talamau atau juga disebut Gunung Ophir adalah gunung tertinggi di Sumatra Barat yang terletak di Kabupaten Pasaman Barat, berdampingan dengan Gunung Pasaman. Gunung ini memiliki ketinggian 2,920 meter dan termasuk dalam tipe gunung api tidak aktif.",
            "Gunung Sinabung (bahasa Karo: Deleng Sinabung) adalah gunung api di Dataran Tinggi Karo, Kabupaten Karo, Sumatra Utara, Indonesia. Sinabung bersama Gunung Sibayak di dekatnya adalah dua gunung berapi aktif di Sumatra Utara dan menjadi puncak tertinggi ke 2 di provinsi itu. Ketinggian gunung ini adalah 2.460 meter.",
            "Gunung Kerinci (juga dieja \"Kerintji\", dan dikenal sebagai Gunung Gedang, Berapi Kurinci, Kerinchi, Korinci, atau Puncak Indrapura) adalah gunung tertinggi di Sumatra, gunung berapi tertinggi di Indonesia, dan puncak tertinggi di Indonesia di luar Papua."
    };

    public static ArrayList<ListGalleryModel> getListData(){
        ListGalleryModel listGalleryModel  = null;
        ArrayList<ListGalleryModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++){
            listGalleryModel = new ListGalleryModel();
            listGalleryModel.setMountPhoto(photo[i]);
            listGalleryModel.setMountName(title[i]);
            listGalleryModel.setMountDetail(detail[i]);
            list.add(listGalleryModel);
        }
        return list;
    }

}
