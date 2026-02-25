package jobsheet3;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen03[] arrayOfDosen = new Dosen03[3];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");

            arrayOfDosen[i] = new Dosen03(kode, nama, jenisKelamin, usia);
        }

        int counter = 1;
        for (Dosen03 dosen03 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dosen03.kode);
            System.out.println("Nama          : " + dosen03.nama);
            System.out.println("Jenis Kelamin : " + (dosen03.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen03.usia);
            System.out.println("--------------------------------------------");
            counter++;
        }

        DataDosen03 dosen = new DataDosen03("","",true,0); // objek dummy, field tidak digunakan
        System.out.println();
        dosen.dataSemuaDosen(arrayOfDosen);
        dosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dosen.infoDosenPalingTua(arrayOfDosen);
        dosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
