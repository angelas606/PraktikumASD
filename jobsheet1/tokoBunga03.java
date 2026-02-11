package jobsheet1;

public class tokoBunga03 {
    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int[] harga = {75000, 50000, 60000, 10000};

    public static int hitungPendapatan(int cabang) {
        int total = 0;
        for (int i = 0; i < stock[cabang].length; i++) {
            total += stock[cabang][i] * harga[i];
        }

        return total;
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(i);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status\t: " + statusCabang(pendapatan));
            System.out.println("-----------------------------------------------");
        }
    }
}
