package kuis1;

public class Mahasiswa03 {
    public String nim;
    public String nama;
    Buku03[] bukuDipinjam;
    int jumlahPinjam;

    public Mahasiswa03(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new Buku03[2];
        this.jumlahPinjam = 0;
    }

    public boolean pinjamBuku(Buku03 buku) {
        if (jumlahPinjam >= bukuDipinjam.length) {
            System.out.println("Gagal! " + nama + " sudah meminjam 2 buku.");
            return false;
        }

        bukuDipinjam[jumlahPinjam] = buku;
        jumlahPinjam++;
        buku.statusPeminjaman = true;
        return true;
    }

    public boolean kembalikanBuku(String kode) {
        for (int i = 0; i < jumlahPinjam; i++) {
            if (bukuDipinjam[i].kodeBuku.equals(kode)) {
                bukuDipinjam[i].statusPeminjaman = false;

                for (int j = i; j < jumlahPinjam - 1; j++) {
                    bukuDipinjam[j] = bukuDipinjam[j + 1];
                }

                bukuDipinjam[jumlahPinjam - 1] = null; 
                jumlahPinjam--;
                return true;
            }
        }
        return false;
    }

    public void tampilkanPinjaman() {
        if (jumlahPinjam == 0) {
            return;
        }

        System.out.print(nama + " meminjam: ");
        for (int i = 0; i < jumlahPinjam; i++) {
            System.out.print(bukuDipinjam[i].judulBuku);
            if (i < jumlahPinjam - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
