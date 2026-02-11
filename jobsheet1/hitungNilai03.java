package jobsheet1;

import java.util.Scanner;

public class hitungNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        double nilai = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas) ;
        String huruf, pesan;

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("===============================");
            System.out.println("===============================");
            return;
        }

        if (nilai >= 80 && nilai <= 100) {
            huruf = "A";
        } else if (nilai >= 73 && nilai <= 80) {
            huruf = "B+";
        } else if (nilai >= 65 && nilai <= 73) {
            huruf = "B";
        } else if (nilai >= 60 && nilai <= 65) {
            huruf = "C+";
        } else if (nilai >= 50 && nilai <= 60) {
            huruf = "C";
        } else if (nilai >= 39 && nilai <= 50) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        if (huruf.equals("A") || huruf.equals("B") || huruf.equals("B+") || huruf.equals("C") || huruf.equals("C+")) {
            pesan = "SELAMAT ANDA LULUS";
        } else {
            pesan = "ANDA TIDAK LULUS";
        }

        System.out.println("Nilai Akhir: " + nilai);
        System.out.println("Nilai Huruf: " + huruf);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(pesan);
    }
}
