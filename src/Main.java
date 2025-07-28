//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Целые числа от 1 до 10: ");
        for (int t = 1; t <= 10; t++) {
            System.out.println("Целое число " + t);
        }

        System.out.println("Целые числа от 10 до 1: ");
        for (int t = 10; t >= 1; t--) {
            System.out.println("Целое число " + t);
        }

        System.out.println("Чётные числа от 0 до 17: ");
        for (int t = 0; t <= 17; t = t + 2) {
            System.out.println("Чётное число " + t);
        }

        System.out.println("Числа от 10 до -10: ");
        for (int t = 10; t >= -10; t--) {
            System.out.println("Число " + t);
        }

        System.out.println("Високосные года, начиная с 1904 года до 2096: ");
        for (int t = 1904; t <= 2096; t = t + 4) {
            System.out.println("Високосный год " + t);
        }

        System.out.println("Последовательность чисел от 7 до 98: ");
        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println("Число " + t);
        }

        System.out.println("Последовательность чисел от 1 до 512: ");
        for (int t = 1; t <= 512; t = t * 2) {
            System.out.println("Число " + t);
        }

        System.out.println("Сумма годовых накоплений, при вкладах по 29 000 рублей: ");
        int contribution = 29000;
        int total = 0;
        for (int t = 0; t < 12; t++) {
            total = total + contribution;
        }
        System.out.println(total);

        System.out.println("Сумма годовых накоплений, при вкладах по 29 000 рублей под 1%: ");
        int contributionA = 29000;
        int totalA = 0;
        for (int t = 0; t < 12; t++) {
            totalA = totalA + totalA / 100;
            totalA = totalA + contributionA;
        }
        System.out.println(totalA);

        System.out.println("Таблица умножения на 2: ");
        for (int t = 1; t <= 10; t++) {
            int res = t * 2;
            System.out.println("2 умножить на " + t + " = " + res);
        }
    }
}