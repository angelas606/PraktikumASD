package cm1;

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
}
