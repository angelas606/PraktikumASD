package jobsheet11;

public class QueueAntrian03 {
    NodeAntrian03 front;
    NodeAntrian03 rear;
    int size;

    public QueueAntrian03() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(MahasiswaTugas03 data) {
        NodeAntrian03 newNode = new NodeAntrian03(data);
        
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil ditambahkan ke antrian!");
    }

    public MahasiswaTugas03 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak dapat memanggil!");
            return null;
        }
        
        MahasiswaTugas03 dequeuedData = front.data;
        front = front.next;
        size--;
        
        if (isEmpty()) {
            rear = null;
        }
        
        return dequeuedData;
    }

    public MahasiswaTugas03 peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        return front.data;
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong!");
        } else {
            front = null;
            rear = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan!");
        }
    }

    public int getSize() {
        return size;
    }

    public void displayFrontAndRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("\n--- Informasi Antrian ---");
            System.out.print("Antrian Terdepan: ");
            front.data.tampilInformasi();
            System.out.print("Antrian Paling Akhir: ");
            rear.data.tampilInformasi();
        }
    }

    public void displayAllQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("\n--- Daftar Antrian ---");
            int no = 1;
            NodeAntrian03 current = front;
            while (current != null) {
                System.out.print(no + ". ");
                current.data.tampilInformasi();
                current = current.next;
                no++;
            }
            System.out.println("Jumlah mahasiswa yang mengantre: " + size);
        }
    }
}
