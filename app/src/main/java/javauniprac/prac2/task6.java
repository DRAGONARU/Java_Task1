package javauniprac.prac2;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            if(a % 2 == 0){
                System.out.println(a + " - чётное");
            }
            else{
                System.out.println(a + " - нечётное");
            }
        }
    }
}
