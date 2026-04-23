package jobsheet9;

public class StackSurat03 {
    Surat03[] stack;
    int top;
    int size;

    public StackSurat03(int size) {
        this.size = size;
        stack = new Surat03[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat03 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat03 pop() {
        if(!isEmpty()) {
            Surat03 s = stack[top];
            s.sudahDiproses = true;
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }


    public boolean cari(String nama) {
        for (int i = 0; i < size; i++) {
            if (stack[i] != null && stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                return true;
            }
        }
        return false;
    }
}
