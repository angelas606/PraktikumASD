package jobsheet5;

public class MahasiswaMain {
    public static void main(String[] args) {
        
        Mahasiswa[] mhs = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        Mahasiswa nm = new Mahasiswa();

        int maxUTS = nm.utsTertinggi(mhs, 0, mhs.length-1);
        int minUTS = nm.utsTerendah(mhs, 0, mhs.length-1);
        double rataUAS = nm.rataUAS(mhs);

        System.out.println("Nilai UTS Tertinggi: " + maxUTS);
        System.out.println("Nilai UTS Terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}
