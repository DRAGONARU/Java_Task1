package javauniprac.prac1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = 4 * (long)Math.pow(x, 3) + 23 * x - 55;
        System.out.println(y);
    }
}
