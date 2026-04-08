package jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------");
            list.tambah(new Mahasiswa03(nim, nama, kelas, ipk));
        }

        //melakukan pencarian data sequential 
        // list.tampil();
        // System.out.println("----------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("----------------------------------");
        // System.out.println("Masukkan IPK Mahasiswa yang ingin dicari: ");
        // System.out.print("IPK: ");
        // double cari = sc.nextDouble();

        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        list.tampil();
        System.out.println("----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari:");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
