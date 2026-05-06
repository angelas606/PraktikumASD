package jobsheet11;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        System.out.print("Masukkan jumlah mahasiswa yang akan ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nData mahasiswa ke-" + i + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println();
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Martin berada pada index: " + sll.indexOf("martin"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
