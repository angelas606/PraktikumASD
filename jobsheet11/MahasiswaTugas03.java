package jobsheet11;

public class MahasiswaTugas03 {
    String nim;
    String nama;
    String kelas;

    MahasiswaTugas03() {

    }

    MahasiswaTugas03(String nm, String name, String kls) {
        nim = nm;
        nama = name;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas);
    }
}
