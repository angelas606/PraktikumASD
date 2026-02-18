package jobsheet2;

public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 dosen1 = new Dosen03();
        dosen1.idDosen = "D001";
        dosen1.nama = "Merry Theressa Papalangi, S.Kom., M.MT.";
        dosen1.statusAktif = false;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Sistem Informasi Bisnis";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2026);
        dosen1.tampilInformasi();

        Dosen03 dosen2 = new Dosen03("D002", "Nabila Pebri Mahrani, S.T., M.MT.", true, 2020, "Teknologi Informasi");
        dosen2.hitungMasaKerja(2026);
        dosen2.tampilInformasi();
        dosen2.ubahKeahlian("Sistem Informasi Bisnis");
        dosen2.tampilInformasi();

    }
}
