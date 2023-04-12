import java.util.Arrays;

public class Main {
    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int summ = 0;
        for (int x : array)
            summ += x;
        System.out.printf("Сумма трат за месяц составила %d рублей%n%n", summ);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int maxValue = 0;
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) maxValue = array[i];
            if (array[i] < minValue) minValue = array[i];
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей%n%n", minValue, maxValue);
    }

    public static void task3() {
        System.out.println("Задача 3");
        double averageValue = 0.0;
        int summ = 0;
        for (int i = 0; i < array.length; i++)
            summ += array[i];
        averageValue = (double) summ / array.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n%n", averageValue);
    }
}