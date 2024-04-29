/*
Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
Не использовать методы класса Arrays.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int value = console.nextInt();
        int[] arr = new int[value];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println();

        int el = 0;
        System.out.println("Введите число- ");
        int m = console.nextInt();


        for (int i = 0; i < arr.length; i++){
            if (m == arr[i]){
                System.out.println("Число, вошедшее в массив: " + el);

            }

        }System.out.println("Число, не вошедшее в массив: " + m);
    }
}
