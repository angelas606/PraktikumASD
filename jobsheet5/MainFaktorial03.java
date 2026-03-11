package jobsheet5;

import java.util.Scanner;

public class MainFaktorial03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        Faktorial03 fk = new Faktorial03();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
