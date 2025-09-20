# Post-Test-3_PBO
danial hirzan akbary 
2409116098

## Deskripsi Program

Program ini dibuat untuk memenuhi tugas praktikum Pemrograman Berorientasi Objek (PBO).
Aplikasi ini memungkinkan pengguna melakukan CRUD (Create, Read, Update, Delete) pada data mainan, serta menerapkan konsep Encapsulation, Inheritance, dan Overriding.

### Hal yang di tambahkan dari program sebelumnya
<pre>Encapsulation
Menggunakan getter dan setter untuk mengakses atribut nama, harga, dan stok.

Inheritance
Terdapat superclass Mainan dan dua subclass yaitu MainanBoneka dan MainanMobil.

Overriding
Method tampilkanInfo() di-override pada subclass agar menampilkan informasi sesuai jenis mainan.</pre>

### Fitur Program

<pre>Tambah mainan baru (Create)
Lihat daftar mainan (Read)
Ubah data mainan (Update)
Hapus mainan (Delete)
Menampilkan informasi detail sesuai jenis mainan (Overriding)</pre>

### Struktur Kelas

<pre>Mainan.java - Superclass, berisi atribut (nama, harga, stok) dan getter/setter.
MainanBoneka.java - Subclass, override method tampilkanInfo().
MainanMobil.java - Subclass, override method tampilkanInfo().
MainanService.java - Menyediakan fitur CRUD menggunakan ArrayList.
MainApp.java - Berisi menu utama dan logika interaksi dengan pengguna.</pre>

## Alur Program (Output)

