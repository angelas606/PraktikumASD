package jobsheet6;

public class DataDosen03 {
    Dosen03 [] dosen = new Dosen03[5];
    int idx;

    void tambah(Dosen03 d) {
        if (idx < dosen.length) {
            dosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen03 d : dosen) {
            d.tampil();
            System.out.println("-----------------");
        }
    }

    void sortingASC() {
        int temp = 0;
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-1-i; j++) {
                if (dosen[j].usia > dosen[j+1].usia) {
                    temp = dosen[j].usia;
                    dosen[j].usia = dosen[j+1].usia;
                    dosen[j+1].usia = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx-1; i++) {
            int max = i;
            for (int j = i+1; j < idx; j++) {
                if (dosen[j].usia > dosen[max].usia) {
                    max =j;
                }
            }
            Dosen03 temp = dosen[i];
            dosen[i] = dosen[max];
            dosen[max] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen03 temp = dosen[i];
            int j = i -1;
            while (j >= 0 && dosen[j].usia < temp.usia) {
                dosen[j+1] = dosen[j];
                j--;
            }
            dosen[j+1] = temp;
        }
    }
}
