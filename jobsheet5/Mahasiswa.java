package jobsheet5;

public class Mahasiswa {
    String nama;
    String nim;
    int tahun, uas, uts;

    Mahasiswa() {

    }

    Mahasiswa(String nama, String nim, int tahun, int uas, int uts) {
        this.nama = nama;
        this.nim = nim;
        this.tahun = tahun;
        this.uts = uts;
        this.uas = uas;
    }

    int utsTertinggi(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int left = utsTertinggi(arr, l, mid);
        int right = utsTertinggi(arr, mid + 1, r);

        if (left > right) {
            return left;
        } else {
            return right;
        }
    }

    int utsTerendah(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;
        int left = utsTerendah(arr, l, mid);
        int right = utsTerendah(arr, mid + 1, r);

        if (left < right) {
            return left;
        } else {
            return right;
        }
    }

    double rataUAS(Mahasiswa arr[]){
        int total = 0;

        for (int i  = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }

        return (double) total / arr.length;
    }

}
