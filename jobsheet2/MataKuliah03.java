package jobsheet2;

public class MataKuliah03 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah03() {

    }

    public MataKuliah03(String kode, String nm, int sks, int jam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam tidak bisa dikurangi lebih dari jumlah jam saat ini");
        }
    }
}
