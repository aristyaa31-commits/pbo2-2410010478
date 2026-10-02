/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 * Menjalankan skenario peminjaman dan pengembalian pada Perpustakaan Mini.
 */
public class AplikasiPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambah(new Buku(
                "B001",
                "Laskar Pelangi",
                2005,
                "Andrea Hirata"
        ));

        perpus.tambah(new Buku(
                "B002",
                "Clean Code",
                2008,
                "Robert C. Martin"
        ));

        perpus.tambah(new Majalah(
                "M001",
                "Majalah Teknologi Kita",
                2026,
                "Agustus"
        ));

        // Menambahkan Skripsi
        perpus.tambah(new Skripsi(
                "S001",
                "Sistem Informasi Perpustakaan",
                2025,
                "Siti Rahmah",
                "Teknik Informatika"
        ));

        Anggota siti = new Anggota(
                "2410010123",
                "Siti Rahmah"
        );

        Anggota budi = new Anggota(
                "2410010456",
                "Budi Santoso"
        );

        // Menampilkan semua koleksi
        tampilkanDaftar(perpus);

        // ==========================================
        // PENCARIAN SKRIPSI
        // ==========================================

        System.out.println();
        System.out.println("=== Pencarian Skripsi ===");

        Koleksi hasilSkripsi = perpus.cari("S001");

        if (hasilSkripsi != null) {
            System.out.println("Skripsi ditemukan:");
            System.out.println(hasilSkripsi);
        } else {
            System.out.println("Skripsi tidak ditemukan.");
        }

        // ==========================================
        // PERCOBAAN MEMINJAM SKRIPSI
        // ==========================================

        System.out.println();
        System.out.println("=== Percobaan Meminjam Skripsi ===");

        cetakPinjam(perpus, "S001", siti);

        // ==========================================
        // PEMINJAMAN BUKU DAN MAJALAH
        // ==========================================

        System.out.println();

        cetakPinjam(perpus, "B002", siti);
        cetakPinjam(perpus, "B002", budi);
        cetakPinjam(perpus, "M001", budi);

        System.out.println(
                "Peminjam B002: "
                + perpus.getPeminjam("B002").nama()
        );

        System.out.println();

        // ==========================================
        // PENGEMBALIAN
        // ==========================================

        cetakKembali(perpus, "B002", 2);
        cetakKembali(perpus, "M001", 3);

        System.out.println();

        System.out.println(
                "Koleksi tersedia: "
                + perpus.jumlahTersedia()
                + " dari "
                + perpus.getDaftarKoleksi().size()
        );
    }

    private static void tampilkanDaftar(Perpustakaan perpus) {

        System.out.println("=== Daftar Koleksi ===");

        for (Koleksi k : perpus.getDaftarKoleksi()) {
            System.out.println(k);
        }
    }

    private static void cetakPinjam(
            Perpustakaan perpus,
            String kode,
            Anggota anggota) {

        boolean berhasil = perpus.pinjam(kode, anggota);

        System.out.println(
                anggota.nama()
                + " meminjam "
                + kode
                + ": "
                + (berhasil ? "berhasil" : "gagal")
        );
    }

    private static void cetakKembali(
            Perpustakaan perpus,
            String kode,
            int hariTerlambat) {

        long denda = perpus.kembalikan(
                kode,
                hariTerlambat
        );

        System.out.println(
                "Pengembalian "
                + kode
                + " terlambat "
                + hariTerlambat
                + " hari, denda Rp"
                + denda
        );
    }
}