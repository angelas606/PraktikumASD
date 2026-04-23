package jobsheet9;

public class Surat03 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;
    boolean sudahDiproses;

    Surat03() {

    }

    Surat03(String id, String nama, String kelas, char jenis, int durasi) {
        idSurat = id;
        namaMahasiswa = nama;
        this.kelas = kelas;
        jenisIzin = jenis;
        this.durasi = durasi;
        sudahDiproses = false;
    }

    public void tampil() {
        System.out.println("ID\t: " + idSurat);
        System.out.println("Nama\t: " + namaMahasiswa);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("Jenis\t: " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi\t: " + durasi + " hari");
        System.out.println("Status\t: " + (sudahDiproses ? "Sudah Diproses" : "Belum Diproses"));
        System.out.println("----------------------------");
    }
}
