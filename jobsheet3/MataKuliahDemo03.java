package jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: " );
        int mk = sc.nextInt();
        sc.nextLine();
        MataKuliah03[] arrayOfMataKuliah = new MataKuliah03[mk];

        MataKuliah03 matkul = new MataKuliah03("", "", 0, 0);
        System.out.println();
        matkul.tambahData(arrayOfMataKuliah, sc);
        matkul.cetakInfo(arrayOfMataKuliah);
    }
}
