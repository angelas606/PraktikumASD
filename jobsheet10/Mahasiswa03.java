package jobsheet10;

public class Mahasiswa03 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa03(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
