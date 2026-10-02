/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 * Skripsi hanya dapat dibaca di tempat dan tidak dapat dipinjam.
 */
public class Skripsi extends Koleksi {

    private final String penulis;
    private final String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit,
                   String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    /**
     * Skripsi tidak dapat dipinjam karena hanya dibaca di tempat.
     */
    @Override
    public boolean pinjam() {
        return false;
    }

    /**
     * Skripsi tidak memiliki batas waktu peminjaman.
     */
    @Override
    public int batasHariPinjam() {
        return 0;
    }

    /**
     * Skripsi tidak memiliki denda keterlambatan.
     */
    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0;
    }

    @Override
    public String keterangan() {
        return "Skripsi karya " + penulis
                + ", Program Studi " + programStudi;
    }
}