package jobsheet6;

public class Dosen03 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen03() {
    }

    Dosen03(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        String jkText = jenisKelamin ? "Pria" : "Wanita";
        System.out.println("Jenis Kelamin: " + jkText); 
        System.out.println("Usia: " + usia);
    }
}
