package jobsheet6;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen03 list = new DataDosen03();

        for (int i = 0; i < list.dosen.length; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i+1));
            System.out.print("Kode: ");
            String kode = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            boolean jk;
            while (true) {
                    System.out.print("Jenis Kelamin (Pria/Wanita): ");
                    String input = sc.nextLine();
                    if (input.equalsIgnoreCase("Pria")) {
                        jk = true;
                        break;
                    } else if (input.equalsIgnoreCase("Wanita")) {
                        jk = false;
                        break;
                    } else {
                        System.out.println("Input salah! Coba lagi.");
                    }
                }
            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            Dosen03 d = new Dosen03(kode, nama, jk, usia);
            list.tambah(d);
        }

        System.out.println("Data Dosen setelah sorting berdasarkan usia (ASC)");
        list.sortingASC();
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia (DESC)");
        list.sortingDSC();
        list.tampil();
    }
}
