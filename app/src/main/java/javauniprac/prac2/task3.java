package javauniprac.prac2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N > 0) {
            int y = N % 10;
            System.out.print(y);
            N /= 10;
        }
    }
}
