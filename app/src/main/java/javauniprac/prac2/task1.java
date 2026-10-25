package javauniprac.prac2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int y = 0;
        for (int i = N; i <= N * 2; i++) {
            y += i * i;
        }
        System.out.println(y);
    }
}