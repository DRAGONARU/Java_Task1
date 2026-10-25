package javauniprac.prac1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        if(x > y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
}
