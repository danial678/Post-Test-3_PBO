/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer-GK
 */
public class MainanElektronik extends Mainan {
    private int baterai;

    public MainanElektronik(String nama, double harga, int baterai) {
        super(nama, harga);
        this.baterai = baterai;
    }

    public int getBaterai() {
        return baterai;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Mainan Elektronik ===");
        System.out.println("Nama Mainan : " + getNama());
        System.out.println("Harga       : Rp " + getHarga());
        System.out.println("Baterai     : " + baterai + " jam");
        System.out.println("-------------------------");
    }
}
