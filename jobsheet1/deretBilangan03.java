package jobsheet1;

import java.util.Scanner;

public class deretBilangan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input NIM: ");
        long nim = sc.nextLong();

        long n = nim % 100; 

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
