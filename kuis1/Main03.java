package kuis1;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan03 perpustakaan = new Perpustakaan03(10, 10);
        int menu;
        boolean keluar = false;

        System.out.println("Menu Perpustakaan:");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Tambah Mahasiswa");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Tampilkan Peminjaman");
        System.out.println("6. Keluar");

        while (!keluar) {
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    perpustakaan.tambahBuku(sc);
                    break;
                case 2:
                    perpustakaan.tambahMahasiswa(sc);
                    break;
                case 3:
                    perpustakaan.pinjamBuku(sc);
                    break;
                case 4:
                    perpustakaan.kembalikanBuku(sc);
                    break;
                case 5:
                    perpustakaan.tampilkanPeminjaman();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    keluar = true;
                    break;
                default:
                    System.out.println("Menu tidak ditemukan!\n");
                    break;
            }
        }

        sc.close();
    }
}
