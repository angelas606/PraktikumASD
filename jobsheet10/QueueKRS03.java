package jobsheet10;

public class QueueKRS03 {
    Mahasiswa03[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;
    int maxDilayani = 30;

    QueueKRS03(int n) {
        max = n;
        data = new Mahasiswa03[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa03 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        if (IsEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggilAntrian() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }
        for (int i = 0; i < 2; i++) {
            Mahasiswa03 mhs = data[front];
            System.out.println("Dipanggil: ");
            mhs.tampilkanData();

            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    public void lihat2Antrian() {
        if (size >= 2) {
            System.out.println("2 Antrian terdepan: ");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        } else {
            System.out.println("Antrian belum cukup.");
        }
    }

    public void lihatTerakhir() {
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir: ");
            data[rear].tampilkanData();
        }
    }

    public void tampilSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahDilayani() {
        System.out.println("Sudah dilayani: " + jumlahDilayani);
    }

    public void belumDilayani() {
        System.out.println("Belum KRS: " + (maxDilayani - jumlahDilayani));
    }
}
