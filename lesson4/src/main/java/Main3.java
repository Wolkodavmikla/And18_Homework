
import java.util.Scanner;

/*Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.*/
public class Main3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = console.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        System.out.print("Введите число для удаления: ");
        int num = console.nextInt();


        boolean found = false;
        for (int value : arr) {
            if (value == num) {
                found = true;
                break;
            }
        }
        if (found) {
            int newSize = size;
            for (int value : arr) {
                if (value == num) {
                    newSize--;
                }
            }
            int[] newArr = new int[newSize];
            int index = 0;
            for (int value : arr) {
                if (value != num) {
                    newArr[index] = value;
                    index++;
                }
            }
            System.out.println("Число " + num + " удалено из массива.");
            System.out.print("Новый массив: ");
            for (int value : newArr) {
                System.out.print(value + " ");
            }
        } else {
            System.out.println("Число " + num + " не найдено в массиве.");

        }
    }
}
