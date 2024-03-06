import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Arithmetic arithmetic = new Arithmetic();
        Array array = new Array();
        Stray stray = new Stray();

        System.out.println("Приветствую, пользователь!");

        while (true) {
            printMenu();

            int command = scanner.nextInt();
            if (command == 1) {
                arithmetic.arithmeticOperations();
                System.out.println();
            } else if (command == 2) {
                array.Masiv();
                System.out.println();
            } else if (command == 3) {
                stray.comparisonStray();
                System.out.println();
            } else if (command == 0) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu(){
        System.out.println("Выберите действие:");
        System.out.println("1 - Арифметические действия с числами");
        System.out.println("2 - Выбрать из массива четные числа");
        System.out.println("3 - Сравнить строки");
        System.out.println("0 - Выход");
    }
}

