package jobsheet1;

import java.util.Scanner; 

public class Tugas203 {
    public static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("Data Jadwal ke-" + (i +1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang Kuliah : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah : ");
            jadwal[i][3] = sc.nextLine();
            sc.nextLine();
        }
    }

    public static void tampiJadwal(String[][] jadwal, int n) {
        System.out.println("\n========== DAFTAR JADWAL KULIAH ==========");
        System.out.println("No  | Mata Kuliah      | Ruang      | Hari   | Jam");
        System.out.println("-" + "-".repeat(55));
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d | %-16s | %-10s | %-6s | %s\n", 
                (i+1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n, String hari) {
        System.out.println("Jadwal pada hari " + hari + ": ");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
            }
        }
    }

    public static void cariMatkul(String[][] jadwal, int n, String mk) {
        System.out.println("Hasil pencarian mata kuliah " + mk + ": ");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari : " + jadwal[i][2]);
                System.out.println("Jam : " + jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];
        boolean sudahInput = false;
        int pilihan;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Input jadwal kuliah");
            System.out.println("2. Tampilkan jadwal");
            System.out.println("3. Cari jadwal berdasarkan hari");
            System.out.println("4. Cari jadwal berdasarkan mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5) : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    inputJadwal(jadwal, n, sc);
                    sudahInput = true;
                    System.out.println("Data jadwal berhasil diinput!");
                    break;
                case 2:
                    if (sudahInput) {
                        tampiJadwal(jadwal, n);
                    } else {
                        System.out.println("Silakan input data jadwal terlebih dahulu!");
                    }
                    break;
                case 3:
                    if (sudahInput) {
                        System.out.print("Masukkan hari untuk dicari : ");
                        String hari = sc.nextLine();
                        cariHari(jadwal, n, hari);
                    } else {
                        System.out.println("Silakan input data jadwal terlebih dahulu!");
                    }
                    break;
                case 4:
                    if (sudahInput) {
                        System.out.print("Masukkan nama mata kuliah untuk dicari : ");
                        String mk = sc.nextLine();
                        cariMatkul(jadwal, n, mk);
                    } else {
                        System.out.println("Silakan input data jadwal terlebih dahulu!");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
