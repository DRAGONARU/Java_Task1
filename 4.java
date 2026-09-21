import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, ты похоже решил положить деньги на вклад? Мы тебе поможем!");
        System.out.println("Это программа считает сложный процент для вкладов");
        System.out.println("В конце ты получишь итоговая сумма денег, которая накопится к концу расчетного периода!");
        System.out.println("Введите начальная сумма инвестиций:");
        double P = scanner.nextDouble();
        System.out.println("Введите годовая процентная ставка (в десятичной дроби):");
        double r = scanner.nextDouble();
        System.out.println("Введите количество начислений процентов в год:");
        double n = scanner.nextDouble();
        System.out.println("Введите срок размещения вклада или инвестиций в годах:");
        double t = scanner.nextDouble();
        if(P < 0){
            System.out.println("Вы не можете держать отрицательное колличество денег на вкладе");
            return ;
        }
        if(r < 0){
            System.out.println("Процентная ставка не может быть отрицательной");
            return ;
        }
        if(n <= 0){
            System.out.println("Количество начислений не может быть меньше 0");
            return ;
        }
        if(t <= 0){
            System.out.println("Срок вклада не может быть меньше 0");
            return ;
        }
        double A = P * Math.pow((1 + r / n), n * t);
        System.out.println("Ваши накопления через " + t + " лет: " + A);
        
    }
}
