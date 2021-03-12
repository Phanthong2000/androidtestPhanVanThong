package com.example.listview;

public class Google {
    private int img;
    private String name;
    private String price;

    public Google() {
    }

    public Google(int img, String name, String price) {
        this.img = img;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
