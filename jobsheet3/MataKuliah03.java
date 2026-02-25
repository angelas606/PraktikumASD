package jobsheet3;

import java.util.Scanner;

public class MataKuliah03 {
    public String kode, dummy;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah03 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(MataKuliah03[] arrayOfMataKuliah, Scanner sc) {
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i +1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah03(kode, nama, sks, jumlahJam);
        }
    } 

    void cetakInfo(MataKuliah03[] arrayOfMataKuliah) {
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1)); 
            System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
            System.out.println("Sks         : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah jam  : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("------------------------------------");
        }
    }
}
