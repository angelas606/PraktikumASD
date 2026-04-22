package cm1;

public class LaporanMahasiswa {
    Mahasiswa mahasiswa;
    int totalPinjam;
    int totalDenda;
    int totalTerlambat;

    LaporanMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.totalPinjam = 0;
        this.totalDenda = 0;
        this.totalTerlambat = 0;
    }

    void hitungLaporan(Peminjaman[] pinjam) {
        for (Peminjaman p : pinjam) {
            if (p.mhs.nim.equals(this.mahasiswa.nim)) {
                totalPinjam++;
                totalDenda += p.denda;
                if (p.terlambat > 0) {
                    totalTerlambat++;
                }
            }
        }
    }

    void tampilLaporan() {
        System.out.println("NIM: " + mahasiswa.nim + " | Nama: " + mahasiswa.nama + " | Total Pinjam: " + totalPinjam + " | Total Denda: Rp " + totalDenda + " | Terlambat: " + totalTerlambat + "x");
    }
}
