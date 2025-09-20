/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer-GK
 */
public class MainanEdukasi extends Mainan {
    private String kategori;

    public MainanEdukasi(String nama, double harga, String kategori) {
        super(nama, harga);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Mainan Edukasi ===");
        System.out.println("Nama Mainan : " + getNama());
        System.out.println("Harga       : Rp " + getHarga());
        System.out.println("Kategori    : " + kategori);
        System.out.println("----------------------");
    }
}
