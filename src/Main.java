//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Целые числа от 1 до 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Целое число " + i);
        }

        System.out.println("Целые числа от 10 до 1: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Целое число " + i);
        }

        System.out.println("Чётные числа от 0 до 17: ");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Чётное число " + i);
        }

        System.out.println("Числа от 10 до -10: ");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }

        System.out.println("Високосные года, начиная с 1904 года до 2096: ");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        System.out.println("Последовательность чисел от 7 до 98: ");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Число " + i);
        }

        System.out.println("Последовательность чисел от 1 до 512: ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Число " + i);
        }

        System.out.println("Сумма годовых накоплений, при вкладах по 29 000 рублей: ");
        int contribution = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + contribution;
        }
        System.out.println(total);

        System.out.println("Сумма годовых накоплений, при вкладах по 29 000 рублей под 1%: ");
        int contributionA = 29000;
        int totalA = 0;
        for (int i = 0; i < 12; i++) {
            totalA = totalA + totalA / 100;
            totalA = totalA + contributionA;
        }
        System.out.println(totalA);

        System.out.println("Таблица умножения на 2: ");
        for (int i = 1; i <= 10; i++) {
            int res = i * 2;
            System.out.println("2 умножить на " + i + " = " + res);
        }
    }
}