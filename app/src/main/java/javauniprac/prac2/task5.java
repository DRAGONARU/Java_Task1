package javauniprac.prac2;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в мою программу!");
        runMenuLoop(scanner);
    }

    private static void runMenuLoop(Scanner scanner) {
        while (true) {
            printMenu();
            String command = scanner.next();
            if (!handleCommand(command, scanner)) {
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Введите числовое значение для команды:");
        System.out.println("1 - выполнить расчёт");
        System.out.println("2 - информация о программе");
        System.out.println("3 - информация о разработчике");
        System.out.println("4 - выход из программы");
    }

    private static boolean handleCommand(String command, Scanner scanner) {
        switch (command) {
            case "1":
                runCalculation(scanner);
                return true;
            case "2":
                printProgramInfo();
                return true;
            case "3":
                printDeveloperInfo();
                return true;
            case "4":
                System.out.println("Выход из программы...");
                return false;
            default:
                System.out.println("Неверная команда. Пожалуйста, попробуйте снова.");
                return true;
        }
    }

    private static void runCalculation(Scanner scanner) {
        while (true) {
            try {
                double P = readDouble(scanner, "Введите начальная сумма инвестиций:");
                double r = readDouble(scanner, "Введите годовая процентная ставка (в десятичной дроби):");
                double n = readDouble(scanner, "Введите количество начислений процентов в год:");
                double t = readDouble(scanner, "Введите срок размещения вклада или инвестиций в годах:");
                validateParams(P, r, n, t);
                double A = calculateCompoundInterest(P, r, n, t);
                printResult(A, t);
                return;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректные данные.");
                if (e.getMessage() != null) {
                    System.out.println("Причина: " + e.getMessage());
                }
                System.out.println("Вы хотите попробовать снова? (напишите no если нет)");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Выход из программы...");
                    return;
                }
            }
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static void validateParams(double P, double r, double n, double t) {
        if (P < 0) {
            throw new IllegalArgumentException("Отрицательная сумма инвестиций");
        }
        if (r < 0) {
            throw new IllegalArgumentException("Процентная ставка не может быть отрицательной");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Количество начислений не может быть меньше 0");
        }
        if (t <= 0) {
            throw new IllegalArgumentException("Срок вклада не может быть меньше 0");
        }
    }

    public static double calculateCompoundInterest(double P, double r, double n, double t) {
        return P * Math.pow((1 + r / n), n * t);
    }

    private static void printResult(double A, double t) {
        System.out.println("Ваши накопления через " + t + " лет: " + A);
    }

    private static void printProgramInfo() {
        System.out.println("Это программа считает сложный процент для вкладов");
        System.out.println("В конце ты получишь итоговая сумма денег, которая накопится к концу расчетного периода!");
    }

    private static void printDeveloperInfo() {
        System.out.println("Разработчик: Ефимов Д.В.");
        System.out.println("Группа: РИ-250911");
        System.out.println("Гордость всея ИРИТ-РТФ");
    }
}