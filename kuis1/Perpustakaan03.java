package kuis1;

import java.util.Scanner;

public class Perpustakaan03 {
    public Buku03[] daftarBuku;
    public Mahasiswa03[] daftarMahasiswa;
    public int jumlahBuku;
    public int jumlahMahasiswa;

    public Perpustakaan03(int kapasitasBuku, int kapasitasMahasiswa) {
        daftarBuku = new Buku03[kapasitasBuku];
        daftarMahasiswa = new Mahasiswa03[kapasitasMahasiswa];
        jumlahBuku = 0;
        jumlahMahasiswa = 0;
    }

    public void tambahBuku(Scanner sc) {
        if (jumlahBuku >= daftarBuku.length) {
            System.out.println("Kapasitas buku penuh!");
            return;
        }

        System.out.print("Masukkan kode buku: ");
        String kode = sc.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judul = sc.nextLine();
        System.out.print("Masukkan penulis: ");
        String penulis = sc.nextLine();

        daftarBuku[jumlahBuku] = new Buku03(kode, judul, penulis, false);
        jumlahBuku++;
        System.out.println("Buku berhasil ditambahkan!\n");
    }

    public void tambahMahasiswa(Scanner sc) {
        if (jumlahMahasiswa >= daftarMahasiswa.length) {
            System.out.println("Kapasitas mahasiswa penuh!");
            return;
        }

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();

        daftarMahasiswa[jumlahMahasiswa] = new Mahasiswa03(nim, nama);
        jumlahMahasiswa++;
        System.out.println("Mahasiswa berhasil ditambahkan!\n");
    }

    public void pinjamBuku(Scanner sc) {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = sc.nextLine();

        Mahasiswa03 mahasiswa = cariMahasiswa(nim);
        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan!\n");
            return;
        }

        System.out.print("Masukkan kode buku: ");
        String kode = sc.nextLine();

        Buku03 buku = cariBuku(kode);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan!\n");
            return;
        }

        if (buku.statusPeminjaman) {
            System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena sudah dipinjam orang lain.\n");
            return;
        }

        if (mahasiswa.pinjamBuku(buku)) {
            System.out.println(mahasiswa.nama + " berhasil meminjam " + buku.judulBuku + "\n");
        }
    }

    public void kembalikanBuku(Scanner sc) {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = sc.nextLine();

        Mahasiswa03 mahasiswa = cariMahasiswa(nim);
        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan!\n");
            return;
        }

        System.out.print("Masukkan kode buku: ");
        String kode = sc.nextLine();

        if (mahasiswa.kembalikanBuku(kode)) {
            System.out.println("Buku berhasil dikembalikan!\n");
        } else {
            System.out.println("Buku tidak ditemukan dalam pinjaman mahasiswa ini!\n");
        }
    }

    public void tampilkanPeminjaman() {
        System.out.print("\nDaftar Peminjaman Buku:");
        System.out.println();
        boolean adaPeminjam = false;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].jumlahPinjam > 0) {
                adaPeminjam = true;
                System.out.print(daftarMahasiswa[i].nama + " meminjam: ");
                for (int j = 0; j < daftarMahasiswa[i].jumlahPinjam; j++) {
                    System.out.print(daftarMahasiswa[i].bukuDipinjam[j].judulBuku);
                    if (j < daftarMahasiswa[i].jumlahPinjam - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }

        if (!adaPeminjam) {
            System.out.println("Tidak ada mahasiswa yang meminjam buku.");
        }
        System.out.println();
    }

    private Mahasiswa03 cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    private Buku03 cariBuku(String kode) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kode)) {
                return daftarBuku[i];
            }
        }
        return null;
    }
}
