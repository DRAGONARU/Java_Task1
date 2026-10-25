package javauniprac.prac2;
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в мою программу!");
        while (true) {
            System.out.println("Введите числовое значение для команды:");
            System.out.println("1 - выполнить расчёт");
            System.out.println("2 - информация о программе");
            System.out.println("3 - информация о разработчике");
            System.out.println("4 - выход из программы");
            String command = scanner.next();
            if (command.equals("1")) {
                while(true) {
                    try{
                        System.out.println("Введите начальная сумма инвестиций:");
                        double P = scanner.nextDouble();
                        System.out.println("Введите годовая процентная ставка (в десятичной дроби):");
                        double r = scanner.nextDouble();
                        System.out.println("Введите количество начислений процентов в год:");
                        double n = scanner.nextDouble();
                        System.out.println("Введите срок размещения вклада или инвестиций в годах:");
                        double t = scanner.nextDouble();
                        if(P < 0){
                            throw new IllegalArgumentException("Отрицательная сумма инвестиций");
                        }
                        if(r < 0){
                            throw new IllegalArgumentException("Процентная ставка не может быть отрицательной");
                        }
                        if(n <= 0){
                            throw new IllegalArgumentException("Количество начислений не может быть меньше 0");
                        }
                        if(t <= 0){
                            throw new IllegalArgumentException("Срок вклада не может быть меньше 0");
                        }
                        double A = P * Math.pow((1 + r / n), n * t);
                        System.out.println("Ваши накопления через " + t + " лет: " + A);
                        break;
                    }
                    catch(Exception e){
                        System.out.println("Вы ввели некорректные данные.");
                        System.out.println("Вы хотите попробовать снова? (напишите no если нет)");
                        String answer = scanner.next();
                        if(answer.equalsIgnoreCase("no")){
                            System.out.println("Выход из программы...");
                            break;
                        }
                    }
                }
            }
            else if (command.equals("2")) {
                System.out.println("Это программа считает сложный процент для вкладов");
                System.out.println("В конце ты получишь итоговая сумма денег, которая накопится к концу расчетного периода!");
            }
            else if (command.equals("3")) {
                System.out.println("Разработчик: Ефимов Д.В.");
                System.out.println("Группа: РИ-250911");
                System.out.println("Гордость всея ИРИТ-РТФ");
            }
            else if (command.equals("4")) {
                System.out.println("Выход из программы...");
                break;
            }
            else {
                System.out.println("Неверная команда. Пожалуйста, попробуйте снова.");
            }

        }
    }
}