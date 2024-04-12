import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("ВВедите любое положительное целое число: ");
        int value = console.nextInt();
        int sum = 0;
        for(int value1 = 1;value1 <= value;value1++) {
            sum = sum + value1;
        }
        System.out.println(sum);

    }
}
