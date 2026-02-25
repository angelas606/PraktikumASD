package jobsheet3;

public class DataDosen03 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public DataDosen03(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("-------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("-------------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalPria = 0, countPria = 0;
        int totalWanita = 0, countWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalPria += arrayOfDosen[i].usia;
                countPria++;
            } else {
                totalWanita += arrayOfDosen[i].usia;
                countWanita++;
            }
        }

        double rataPria = countPria == 0 ? 0 : (double) totalPria / countPria;
        double rataWanita = countWanita == 0 ? 0 : (double) totalWanita / countWanita;

        System.out.println("Rerata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rerata Usia Dosen Wanita : " + rataWanita);
        System.out.println("-------------------------------");
    }

    void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen03 palingTua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > palingTua.usia) {
                palingTua = arrayOfDosen[i];
            }
        }
        System.out.println("Data Dosen Paling Tua");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingTua.usia);
        System.out.println("-------------------------------");
    }

    void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen03 palingMuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < palingMuda.usia) {
                palingMuda = arrayOfDosen[i];
            }
        }
        System.out.println("Data Dosen Paling Muda");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingMuda.usia);
        System.out.println("-------------------------------");
    }

}
