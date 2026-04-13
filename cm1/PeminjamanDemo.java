package cm1;

import java.util.Scanner;

public class PeminjamanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mahasiswa = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] peminjaman = {
                new Peminjaman(mahasiswa[0], buku[0], 7),
                new Peminjaman(mahasiswa[1], buku[1], 3),
                new Peminjaman(mahasiswa[2], buku[2], 10),
                new Peminjaman(mahasiswa[2], buku[3], 6),
                new Peminjaman(mahasiswa[0], buku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa m : mahasiswa) {
                        m.tampilMahasiswa();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Daftar Buku");
                    for (Buku b : buku) {
                        b.tampilBuku();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Daftar Peminjaman: ");
                    for (Peminjaman p : peminjaman) {
                        p.tampilPeminjaman();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    Peminjaman.sortDenda(peminjaman);
                    for (Peminjaman p : peminjaman) {
                        p.tampilPeminjaman();
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String find = sc.nextLine();
                    Peminjaman.sortNIM(peminjaman);
                    int index = Peminjaman.binarySearchNIM(peminjaman, find);
                    if (index != -1) {
                        peminjaman[index].tampilPeminjaman();
                    } else {
                        System.out.println("Data peminjaman untuk NIM " + find + " tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silahkan masukkan ulang!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
