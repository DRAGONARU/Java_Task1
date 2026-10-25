package javauniprac.prac2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        int N = scanner.nextInt();
        float y = A;
        for (int i = 1; i <= N; i++) {
            System.out.println(y);
            y *= A;
        }
    }
}
