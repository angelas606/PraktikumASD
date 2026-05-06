package jobsheet11;

import java.util.Scanner;

public class AntrianLayananMain03 {
    static Scanner sc = new Scanner(System.in);
    static QueueAntrian03 antrian = new QueueAntrian03();

    public static void main(String[] args) {
        int pilihan;
        
        System.out.println("SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN");
        System.out.println("==========================================");

        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-8): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambahAntrian();
                    break;
                case 2:
                    panggilAntrian();
                    break;
                case 3:
                    cekAntrianKosong();
                    break;
                case 4:
                    cekAntrianPenuh();
                    break;
                case 5:
                    tampilkanTerdepanAkhir();
                    break;
                case 6:
                    tampilkanJumlahAntrian();
                    break;
                case 7:
                    tampilkanSeluruAntrian();
                    break;
                case 8:
                    kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan sistem antrian!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }

    static void tampilkanMenu() {
        System.out.println("\nMENU UTAMA");
        System.out.println("----------");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian (Dequeue)");
        System.out.println("3. Cek Antrian Kosong");
        System.out.println("4. Cek Antrian Penuh");
        System.out.println("5. Tampilkan Terdepan & Akhir");
        System.out.println("6. Tampilkan Jumlah Antrian");
        System.out.println("7. Tampilkan Seluruh Antrian");
        System.out.println("8. Kosongkan Antrian");
        System.out.println("0. Keluar");
    }

    static void tambahAntrian() {
        System.out.println("\n--- Pendaftaran Antrian ---");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        MahasiswaTugas03 mhs = new MahasiswaTugas03(nim, nama, kelas);
        antrian.enqueue(mhs);
    }

    static void panggilAntrian() {
        System.out.println("\n--- Memanggil Antrian ---");
        if (antrian.isEmpty()) {
            System.out.println("Tidak ada antrian untuk dipanggil!");
        } else {
            MahasiswaTugas03 mhs = antrian.dequeue();
            System.out.println("Mahasiswa yang dipanggil:");
            mhs.tampilInformasi();
        }
    }

    static void cekAntrianKosong() {
        System.out.println("\n--- Cek Antrian Kosong ---");
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian tidak kosong (ada " + antrian.getSize() + " mahasiswa)");
        }
    }

    static void cekAntrianPenuh() {
        System.out.println("\n--- Cek Antrian Penuh ---");
        if (antrian.isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            System.out.println("Antrian tidak penuh (Linked List unlimited)");
        }
    }

    static void tampilkanTerdepanAkhir() {
        antrian.displayFrontAndRear();
    }

    static void tampilkanJumlahAntrian() {
        System.out.println("\n--- Jumlah Antrian ---");
        int jumlah = antrian.getSize();
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + jumlah);
        if (jumlah == 0) {
            System.out.println("Antrian kosong!");
        }
    }

    static void tampilkanSeluruAntrian() {
        antrian.displayAllQueue();
    }

    static void kosongkanAntrian() {
        System.out.println("\n--- Kosongkan Antrian ---");
        antrian.clear();
    }
}
