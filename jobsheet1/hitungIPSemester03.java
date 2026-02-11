package jobsheet1;

import java.util.Scanner;

public class hitungIPSemester03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        
        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i+1));
            System.out.print("Nama MK: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Bobot SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid!");
                i--;
                continue;
            }
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            }
            else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            }
            else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            }
            else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            }
            else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            }
            else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            }
            else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-25s %-10s %-12s %-12s %-12s\n",
                "Nama MK", "SKS", "Nilai Angka", "Nilai Huruf", "Nilai Setara");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-25s %-10d %-12.2f %-12s %-12.2f\n",
                    namaMK[i], sks[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("===================");
        System.out.printf(" IP Semester : %.2f\n", ip);
    }
    
}
