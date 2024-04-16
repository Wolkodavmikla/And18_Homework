
/*
Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = console.nextInt();
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = console.nextInt();

        int[] arr = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(100);
        }
        int[] newArr = new int[size];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[size - 1 - i];
        }
        System.out.println("Начальный массив: " + Arrays.toString(arr));

        System.out.println("Массив в обратном порядке: " + Arrays.toString(newArr));
    }
}

