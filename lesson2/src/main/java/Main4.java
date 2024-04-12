import java.util.Scanner;

/*
Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Какая на улице температура: ");
        int t = console.nextInt();



        if (t > -5) {
            System.out.println("Тепло");
        } else if (t<=-20) {
            System.out.println("Холодно");
        } else if (t<=-5 & t>-20) {
            System.out.println("Нормально");


        }
    }
}
