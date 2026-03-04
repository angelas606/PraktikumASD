package kuis1;

public class Buku03 {
    public String kodeBuku;
    public String judulBuku;
    public String penulis;
    public boolean statusPeminjaman;

    public Buku03(String kode, String judul, String penulis, boolean status) {
        kodeBuku = kode;
        judulBuku = judul;
        this.penulis = penulis;
        statusPeminjaman = status;
    }
}
