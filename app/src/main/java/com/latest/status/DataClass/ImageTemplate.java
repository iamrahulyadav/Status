package com.latest.status.DataClass;

public class ImageTemplate {

    private int imageId;
    private String imageDesc;

    public ImageTemplate(int imageId, String imageDesc) {
        this.imageId = imageId;
        this.imageDesc = imageDesc;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }
}
