package jobsheet10;

import java.util.Scanner;

public class PersetujuanKRS03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS03 q = new QueueKRS03(10);

        int pilih;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Dilayani");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.println("----------------------------");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa03 mhs = new Mahasiswa03(nim, nama, prodi, kelas);
                    q.tambahAntrian(mhs);
                    break;
                case 2:
                    q.panggilAntrian();
                    break;
                case 3:
                    q.tampilSemua();
                    break;
                case 4:
                    q.lihat2Antrian();
                    break;
                case 5:
                    q.lihatTerakhir();
                    break;
                case 6:
                    q.jumlahAntrian();
                    break;
                case 7:
                    q.jumlahDilayani();
                    break;
                case 8:
                    q.belumDilayani();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            } 
        } while (pilih != 0);
    }
}
