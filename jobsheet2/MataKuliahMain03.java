package jobsheet2;

public class MataKuliahMain03 {
    public static void main(String[] args) {
        MataKuliah03 mk1 = new MataKuliah03();
        mk1.kodeMK = "SIB2529";
        mk1.nama = "Sistem Operasi";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.tampilInformasi();

        MataKuliah03 mk2 = new MataKuliah03("SIB2526", "Basis Data", 2, 6);
        mk2.kurangiJam(8);
        mk2.tampilInformasi();
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
