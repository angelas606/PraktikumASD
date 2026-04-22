package cm1;

import java.util.Scanner;

public class PeminjamanMain {
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
            System.out.println("6. Tambahkan Data Peminjaman");
            System.out.println("7. Tampilkan Statistik");
            System.out.println("8. Laporan Per Mahasiswa");
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
                    System.out.println("Setelah diurutkan dengan Insertion Sort (Denda terbesar): ");
                    Peminjaman.sortDenda(peminjaman);
                    for (Peminjaman p : peminjaman) {
                        p.tampilPeminjaman();
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String find = sc.nextLine();
                    Peminjaman[] copy = peminjaman.clone();
                    Peminjaman.sortNIM(copy);
                    int index = Peminjaman.binarySearchNIM(copy, find);
                    if (index != -1) {
                        System.out.println("[Binary Search] Data ditemukan: ");
                        int left = index;
                        while (left > 0 && copy[left - 1].mhs.nim.equals(find)) {
                            left--;
                        }
                        int right = index;
                        while (right < copy.length - 1 && copy[right + 1].mhs.nim.equals(find)) {
                            right++;
                        }
                        for (int i = left; i <= right; i++) {
                            copy[i].tampilPeminjaman();
                        }
                    } else {
                        System.out.println("Data peminjaman untuk NIM " + find + " tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                    case 6:
                        peminjaman = Peminjaman.tambahData(peminjaman, mahasiswa, buku, sc);
                        break;
                case 7:
                    int totalDenda = 0;
                    int jmlTerlambat = 0;
                    int tepat = 0;

                    for (Peminjaman p : peminjaman) {
                        totalDenda += p.denda;
                        if (p.terlambat > 0) {
                            jmlTerlambat++;
                        } else {
                            tepat++;
                        }
                    }

                    System.out.println("=== STATISTIK PEMINJAMAN ===");
                    System.out.println("Total Denda Keseluruhan: " + totalDenda);
                    System.out.println("Jumlah Peminjaman Terlambat: " + jmlTerlambat);
                    System.out.println("Jumlah Peminjaman Tepat Waktu: " + tepat);
                    System.out.println();
                    break;
                case 8:
                    LaporanMahasiswa[] laporan = new LaporanMahasiswa[mahasiswa.length];
                    for (int i = 0; i < mahasiswa.length; i++) {
                        laporan[i] = new LaporanMahasiswa(mahasiswa[i]);
                        laporan[i].hitungLaporan(peminjaman);
                    }
                    System.out.println("=== LAPORAN PER MAHASISWA ===");
                    for (LaporanMahasiswa l : laporan) {
                        l.tampilLaporan();
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
