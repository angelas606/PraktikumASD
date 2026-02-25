package jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa03[] arrayOfMahasiswa = new Mahasiswa03[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa03();

            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }

        Mahasiswa03 mahasiswa = new Mahasiswa03();
        mahasiswa.cetakInfo(arrayOfMahasiswa);
    }
}
