import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задание 1

        System.out.println("Введите два числа");

        System.out.print("Число \"a\" равно ");
        long a = scanner.nextInt();

        System.out.print("Число \"b\" равно ");
        long b = scanner.nextInt();

        scanner.nextLine();

        System.out.println(String.format(
                "Сравнение: %s, Сложение: %d, Вычетание: %d, Деление: %s, Умножение: %d",
                a > b ? "a > b" :
                        a < b ? "a < b" :
                                "a = b", a + b, a - b, b == 0 ? "На 0 делить нельзя" : String.valueOf((double) a / b), a * b
        ));

        //Задание 2

        System.out.println("\nВведите две строки");
        System.out.print("Первая строка: ");
        String firstStr = scanner.nextLine();
        System.out.print("Вторая строка: ");
        String secondStr = scanner.nextLine();

        System.out.println(String.format(
                "%s\n",
                !firstStr.equals(secondStr) ? "Строки неидентичны" : "Строки идентичны"
        ));

        //Задание 3

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Чётные числа в диапазоне от 1 до 10: ");
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
    }
}