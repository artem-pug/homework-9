import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] payments = {10343, 12945, 15637, 11823, 13672};
        int sum = 0;
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задание 2");
        int maxPayment = -1;
        for (int payment : payments) {
            if (payment > maxPayment) {
                maxPayment = payment;
            }
        }

        int minPayment = 1000000;
        for (int payment : payments) {
            if (payment < minPayment) {
                minPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxPayment + " рублей.");
        System.out.println("Задание 3");
        int weeks = 5;
        float averageAmount = 0;
        for (int payment : payments) {
            sum += payment;
        }
        averageAmount = (float) sum / weeks;
        System.out.println(averageAmount);
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}