
/*
Написать программу для вывода названия поры года по номеру
месяца.
При решении используйте оператор if-else-if.
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("ВВедите номер месяца: ");
        int monthNumber = console.nextInt();
        String monthName = null;

        if (monthNumber == 1){
            monthName = "January";
        } else if (monthNumber == 2){
            monthName = "February";
        } else if (monthNumber == 3){
            monthName = "March";
        } else if (monthNumber == 4) {
            monthName = "April";
        } else if (monthNumber == 5) {
            monthName = "May";
        } else if (monthNumber == 6) {
            monthName = "June";
        } else if (monthNumber == 7) {
            monthName = "July";
        } else if (monthNumber == 8) {
            monthName = "August";
        } else if (monthNumber == 9) {
            monthName = "September";
        } else if (monthNumber == 10) {
            monthName = "October";
        } else if (monthNumber == 11) {
            monthName = "November";
        } else if (monthNumber == 12) {
            monthName = "December";
        } else {
            monthName = "Неккоректный номер месяца";
        }






        System.out.println("Название месяца: " + null);
    }

}
