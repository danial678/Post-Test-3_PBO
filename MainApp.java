package main;

import java.util.Scanner;
import service.MainanService;
import model.MainanEdukasi;
import model.MainanElektronik;

public class MainApp {
    public static void main(String[] args) {
        MainanService service = new MainanService();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n======================================");
            System.out.println("         MANAJEMEN KOLEKSI MAINAN");
            System.out.println("======================================");
            System.out.println("1. Tambah Mainan");
            System.out.println("2. Lihat Koleksi Mainan");
            System.out.println("3. Ubah Mainan");
            System.out.println("4. Hapus Mainan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    System.out.println("Pilih jenis mainan: 1. Edukasi | 2. Elektronik");
                    int jenis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    if (jenis == 1) {
                        System.out.print("Masukkan Kategori: ");
                        String kategori = sc.nextLine();
                        service.tambahMainan(new MainanEdukasi(nama, harga, kategori));
                    } else {
                        System.out.print("Masukkan Durasi Baterai (jam): ");
                        int baterai = sc.nextInt();
                        sc.nextLine();
                        service.tambahMainan(new MainanElektronik(nama, harga, baterai));
                    }
                }
                case 2 -> service.tampilkanDaftarMainan();

                case 3 -> {
                    service.tampilkanDaftarMainan();
                    System.out.print("Masukkan index mainan yang ingin diupdate: ");
                    int indexUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Pilih jenis mainan baru: 1. Edukasi | 2. Elektronik");
                    int jenis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Masukkan Nama baru: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Harga baru: ");
                    double harga = sc.nextDouble();
                    sc.nextLine();

                    if (jenis == 1) {
                        System.out.print("Masukkan Kategori baru: ");
                        String kategori = sc.nextLine();
                        service.updateMainan(indexUpdate, new MainanEdukasi(nama, harga, kategori));
                    } else {
                        System.out.print("Masukkan Durasi Baterai baru (jam): ");
                        int baterai = sc.nextInt();
                        sc.nextLine();
                        service.updateMainan(indexUpdate, new MainanElektronik(nama, harga, baterai));
                    }
                }

                case 4 -> {
                    service.tampilkanDaftarMainan();
                    System.out.print("Masukkan index mainan yang ingin dihapus: ");
                    int indexDelete = sc.nextInt();
                    sc.nextLine();
                    service.hapusMainan(indexDelete);
                }

                case 0 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
