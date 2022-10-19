package com.iamnotgod.foodmenu;

public class Culinary {

    private String nama, deskripsi;
    private int harga, id_gambar;

    public Culinary(String nama, String deskripsi, int harga, int id_gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.id_gambar = id_gambar;
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

    public int getId_gambar() {
        return id_gambar;
    }

    public void setId_gambar(int id_gambar) {
        this.id_gambar = id_gambar;
    }
}
