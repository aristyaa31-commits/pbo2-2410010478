package id.ac.uniska.pbo2.uts;

// Nama: Muhammad Aristya Widayadi
// NPM: 2410010478

public class Barang {
    private String nama;
    private Kategori kategori;
    private int harga;
    private int jumlah;

    public Barang(String nama, Kategori kategori, int harga, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int hitungSubtotal() {
        return harga * jumlah;
    }
}