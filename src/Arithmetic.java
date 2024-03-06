import java.util.Scanner;

public class Arithmetic {
    void arithmeticOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();

        System.out.println("Сложение:");
        int sum = a + b;
        System.out.println(sum);

        System.out.println("Вычитание:");
        int sub = a - b;
        System.out.println(sub);

        System.out.println("Умножение:");
        int multi = a * b;
        System.out.println(multi);

        System.out.println("Деление:");
        double div = a / b;
        System.out.println(div);

        System.out.println("Результат сравнения:");
        if (a != b) {
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            }
        } else {
            System.out.println("a = b");
        }

    }
}
