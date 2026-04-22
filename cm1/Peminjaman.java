package cm1;

import java.util.Scanner;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = hitungDenda();
    }

    int hitungDenda() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat > 0) {
            return terlambat * 2000;
        }
        return 0;
    }

    void tampilPeminjaman() {
        int keterlambatan = terlambat > 0 ? terlambat : 0;
        System.out.println(mhs.nama + " | " + buku.judul +
                " | Lama: " + lamaPinjam + " | Terlambat: " + keterlambatan +
                " | Denda: " + denda);
    }

    static void sortDenda(Peminjaman[] peminjaman) {
        for (int i = 1; i < peminjaman.length; i++) {
            Peminjaman temp = peminjaman[i];
            int j = i;
            while (j > 0 && peminjaman[j - 1].denda < temp.denda) {
                peminjaman[j] = peminjaman[j - 1];
                j--;
            }
            peminjaman[j] = temp;
        }
    }

    static void sortNIM(Peminjaman[] peminjaman) {
        for (int i = 1; i < peminjaman.length; i++) {
            Peminjaman temp = peminjaman[i];
            int j = i;
            while (j > 0 && peminjaman[j - 1].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                peminjaman[j] = peminjaman[j - 1];
                j--;
            }
            peminjaman[j] = temp;
        }
    }

    static int binarySearchNIM(Peminjaman[] peminjaman, String nim) {
        int left = 0;
        int right = peminjaman.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = peminjaman[mid].mhs.nim.compareTo(nim);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    static Peminjaman[] tambahData(Peminjaman[] asli, Mahasiswa[] mahasiswa, Buku[] buku, Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        Mahasiswa mhs = null;
        for (Mahasiswa m : mahasiswa) {
            if (m.nim.equals(nim)) {
                mhs = m;
                break;
            }
        }
        if (mhs == null) {
            System.out.println("NIM tidak ditemukan!");
            System.out.println();
            return asli;
        }
        System.out.print("Masukkan Kode Buku: ");
        String kode = sc.nextLine();
        Buku bk = null;
        for (Buku b : buku) {
            if (b.kodeBuku.equals(kode)) {
                bk = b;
                break;
            }
        }
        if (bk == null) {
            System.out.println("Kode buku tidak ditemukan!");
            System.out.println();
            return asli;
        }
        System.out.print("Masukkan Lama Pinjam: ");
        int lama = sc.nextInt();
        sc.nextLine(); 
        Peminjaman baru = new Peminjaman(mhs, bk, lama);
        Peminjaman[] pinjamBaru = new Peminjaman[asli.length + 1];
        System.arraycopy(asli, 0, pinjamBaru, 0, asli.length);
        pinjamBaru[asli.length] = baru;
        System.out.println("Data Berhasil disimpan!");
        System.out.println();
        return pinjamBaru;
    }
}
