package model;

public class Mainan {
    private String nama;
    private double harga;

    public Mainan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mainan : " + nama);
        System.out.println("Harga       : Rp " + harga);
    }
}
