/*
Написать программу для вывода названия поры года по номеру
месяца.
При решении используйте оператор switch-case.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("ВВедите номер месяца: ");
        int monthNumber = console.nextInt();
        String monthName;

        switch (monthNumber) {
            case 1 :
                monthName = "January";
                break;
            case 2 :
                monthName = "February";
                break;
            case 3 :
                monthName = "March";
                break;
            case 4 :
                monthName = "April";
                break;
            case 5 :
                monthName = "May";
                break;
            case 6 :
                monthName = "June";
                break;
            case 7 :
                monthName = "July";
                break;
            case 8 :
                monthName = "August";
                break;
            case 9 :
                monthName = "September";
                break;
            case 10 :
                monthName = "October";
                break;
            case 11 :
                monthName = "November";
                break;
            case 12 :
                monthName = "December";
                break;
            default:
                monthName = "Неккоректный номер месяца";
                break;





        }
        System.out.println("Название месяца: " + monthName);
    }
}
