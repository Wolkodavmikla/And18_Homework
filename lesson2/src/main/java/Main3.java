/*
Напишите программу, которая будет принимать на вход число и на
выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2').
 */
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("ВВедите число: ");
        int value = console.nextInt();

        if (value % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }
    }