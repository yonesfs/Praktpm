package com.example.fragmentrecyclearview;

public class ListGalleryModel {
    private String MountName;
    private int mountPhoto;
    private String mountDetail;

    public String getMountName() {
        return MountName;
    }

    public void setMountName(String mountName) {
        MountName = mountName;
    }

    public int getMountPhoto() {
        return mountPhoto;
    }

    public void setMountPhoto(int mountPhoto) {
        this.mountPhoto = mountPhoto;
    }

    public String getMountDetail() {
        return mountDetail;
    }

    public void setMountDetail(String mountDetail) {
        this.mountDetail = mountDetail;
    }
}
