/*
Необходимо, чтоб программа выводила на экран вот такую
последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98.
В решении используйте цикл while.
 */
public class Main8 {
    public static void main(String[] args) {

        int value = 7;
        while (value <98 ){
            System.out.println(value + " ");
            value+=7;
        }

    }
}
