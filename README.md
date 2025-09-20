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

### Menu Awal
<pre>Tambah mainan baru 
Lihat daftar mainan
Ubah data mainan 
Hapus mainan</pre>

<img width="607" height="206" alt="image" src="https://github.com/user-attachments/assets/9c3693f1-2ead-48c0-8eee-e63407d0dd2c" />

### Tambah Mainan (Create)

<pre>- User pilih menu 1 (Tambah Mainan), program minta input nama, harga, stok, dan jenis mainan.
- Buat objek, jika pilih Boneka buat MainanBoneka, jika Mobil buat MainanMobil.
- Set data menggunakan setter (encapsulation).
- Simpan ke ArrayList di MainanService.
- Tampilkan pesan sukses, kembali ke menu utama.</pre>

<img width="616" height="180" alt="image" src="https://github.com/user-attachments/assets/ff8ee9a5-72d3-41b2-839d-a56e17fccb40" />

### Lihat  Mainan (Read)
<pre>
- User pilih menu 2 (Lihat Mainan), program memanggil tampilkanMainan() di MainanService.
- Cek ArrayList, jika kosong, tampilkan pesan "Belum ada mainan".
- Jika ada data, looping seluruh objek Mainan di list.
- Panggil tampilkanInfo(), menampilkan data sesuai jenis mainan (Boneka atau Mobil), inilah bagian overriding.
- Kembali ke menu utama.
</pre>

<img width="444" height="229" alt="image" src="https://github.com/user-attachments/assets/e39cbe48-5946-4e2b-9200-2d6349b7356d" />

### Ubah Mainan (Update)
<pre>
- User pilih menu 3 (Ubah Mainan), program memanggil tampilkanMainan() agar user tahu daftar mainan.
- Cek apakah ada data, jika kosong, langsung kembali ke menu utama.
- User masukkan nomor mainan yang ingin diubah, program ambil index (dikurangi 1 karena ArrayList mulai dari 0).
- User isi data baru (nama, bahan, tanggal, kondisi, harga, jenis).
- Program membuat objek mainan baru (Boneka/Mobil sesuai input).
- Panggil ubahMainan(index, mainanBaru) di MainanService, data lama diganti dengan data baru.
- Tampilkan pesan “Data mainan berhasil diubah!” lalu kembali ke menu utama.
</pre>

<img width="752" height="427" alt="image" src="https://github.com/user-attachments/assets/623b5480-8204-4512-9a0c-363d7b726925" />

### Hapus Mainan (Delete)
<pre>
- User pilih menu 4 (Hapus Mainan), program memanggil tampilkanMainan() supaya user tahu daftar mainan.
- Cek apakah ada data, jika kosong, kembali ke menu utama
- User masukkan nomor mainan yang ingin dihapus, program ambil index (dikurangi 1).
- Program memanggil hapusMainan(index) di MainanService.
- Data dihapus dari ArrayList, tampilkan pesan “Mainan berhasil dihapus!”.
- Kembali ke menu utama.
</pre>

<img width="553" height="281" alt="image" src="https://github.com/user-attachments/assets/03a6f6bd-be02-49b4-b882-06ff2c9ebf38" />

### Keluar 
<pre>
User pilih menu 5 (Keluar), program menampilkan pesan perpisahan.
Perulangan do-while berhenti karena pilihan == 5.
Scanner ditutup (input.close()), program berhenti sepenuhnya.
</pre>

<img width="950" height="405" alt="image" src="https://github.com/user-attachments/assets/50e158b4-ef67-4475-bac7-3d097d24cc6a" />
