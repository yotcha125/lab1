//Лабораторная работа №1 Вариант 7
//n! = (n — 1)! × n

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int fact = 1;

        for (int i = 0; i <= N; i++) {
            if (i != 0) {
                fact *= i;
            }
            sum += 1 / fact;
        }
        System.out.println("Сумма первых " + N + " членов ряда: " + sum);

        scanner.close();
    }
}