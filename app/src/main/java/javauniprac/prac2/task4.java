package javauniprac.prac2;
import java.util.Scanner;

public class task4 {
    static void calcTriangle(double a) {
        System.out.println("Периметр треугольника: " + (3 * a));
        System.out.println("Площадь треугольника: " + (Math.sqrt(3) / 4 * a * a));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        calcTriangle(a);
    }
}
