package jobsheet9;

import java.util.Scanner;

public class SuratDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackSurat03 stack = new StackSurat03(5);
        int pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    Surat03 surat = new Surat03(id, nama, kelas, jk, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil dimasukkan\n", surat.idSurat);
                    System.out.println();
                    break;
                case 2:
                    Surat03 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat diproses:");
                        diproses.tampil();      
                    }
                    System.out.println();
                    break;
                case 3:
                    Surat03 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampil();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Masukkan nama: ");
                    String cari = sc.nextLine();
                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan!"); 
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <=4);
    }
}
