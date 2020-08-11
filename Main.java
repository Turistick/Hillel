import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        System.out.println("Задание 1.1 (if)");
        System.out.println("Необходимо написать программу, где пользователю предлагалось ввести число");
        System.out.println("на выбор: 1, 2 или 3, а программа должна сказать, какое число ввёл");
        System.out.println("пользователь: 1, 2, или 3. Написать двумя способами. If и switch.");
        System.out.println(" ");

        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int input = inputFigure.nextInt();

        if (input == 1) {
            System.out.println("Вы ввели число 1");
        } else if (input == 2) {
            System.out.println("Вы ввели число 2");
        } else if (input == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели не правильное число");
        }

        System.out.println(" ");
        System.out.println("Задание 1.2 (switch)");
        System.out.println("Необходимо написать программу, где пользователю предлагалось ввести число");
        System.out.println("на выбор: 1, 2 или 3, а программа должна сказать, какое число ввёл");
        System.out.println("пользователь: 1, 2, или 3. Написать двумя способами. If и switch.");
        System.out.println(" ");

        switch (input) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели не правильное число");
                break;
        }
        System.out.println(" ");

        System.out.println("Задание 2");
        System.out.println("Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1 ");
        System.out.println(" ");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" ");

        System.out.println("Задание 3");
        System.out.println("Необходимо вывести на экран таблицу умножения на 3: 3*1=3 3*2=6 3*3=9 3*4=12");
        System.out.println("3*5=15 3*6=18 3*7=21 3*8=24 3*9=27 3*10=30");
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + (3 * i));
        }
        System.out.println(" ");

        // Найти среднее значение суммы чисел от 1 до 100
        System.out.println("Задание 4");
        System.out.println("Найти среднее значение суммы чисел от 1 до 100");
        System.out.println(" ");
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Среднее значение = " + sum / 100);
    }
}