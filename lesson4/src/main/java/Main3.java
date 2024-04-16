
import java.util.ArrayList;
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

        for(int i = 0; i < size; i++){
            arr[i] = console.nextInt();
        }
        System.out.print("Введите число для удаления: ");
        int num = console.nextInt();

        ArrayList<Integer>result = new ArrayList<>();
        boolean found = false;
        for(int value : arr){
            if(value != num) {
                result.add(value);
            }else {
                found = true;
            }
        }
        if(found){
            System.out.println("Результат после удаления: ");
            for(int value : result){
                System.out.print(value + " ");
            }

        }else {
            System.out.println("Число " + num + "не найдено в массиве " );
        }

    }
}
