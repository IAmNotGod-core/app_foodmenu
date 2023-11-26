package com.iamnotgod.foodmenu;

public class Culinary {

    private String nama, deskripsi, imgUrl;
    private int harga;

    public Culinary(String nama, String deskripsi, int harga, String imgUrl) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.imgUrl = imgUrl;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
