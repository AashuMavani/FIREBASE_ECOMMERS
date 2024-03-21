package com.example.firebase_ecommers;

public class ProductData_Model {
    String pId;
    String pName;
    String pDes;
    String pPrice;
    String imgUrl;

    public ProductData_Model() {
    }

    public ProductData_Model(String pId, String pName, String pDes, String pPrice, String imgUrl) {
        this.pId = pId;
        this.pName = pName;
        this.pDes = pDes;
        this.pPrice = pPrice;
        this.imgUrl = imgUrl;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDes() {
        return pDes;
    }

    public void setpDes(String pDes) {
        this.pDes = pDes;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
