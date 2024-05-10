/*
Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить
на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в
формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате
"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и ABC считается
одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности
555.
- Проверить заканчивается ли номер документа на
последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на
вход программы строку.
 */
public class DocNumm {
    public static void main(String[] args) {
        String numDoc = "5554-yth-6678-abc-2e3r";

        String[] split = numDoc.split("-");
        System.out.println(split[0] + " " + split[2]);

        String masketDoc = numDoc.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(masketDoc);


        String letter = numDoc.replaceAll("[^a-z]", "");
        System.out.println(letter.replaceAll("(.{3}|.{1})", "$1/").toLowerCase());

        StringBuilder stringBuilder = new StringBuilder("Letters:");
        for (char letters : letter.toCharArray()) {
            stringBuilder.append(letters).append("");
        }
        System.out.println(stringBuilder.toString());

        if(numDoc.toLowerCase().contains("abc")){
            System.out.println("Номер документа содержит последовательность 'abc' " );
        } else {
            System.out.println("Номер документа не содержит последовательность 'abc'");
        }

        if(numDoc.toLowerCase().startsWith("555")){
            System.out.println("Номер документа начинается на '555'" );
        } else {
            System.out.println("Номер документа не начинается на '555'");
        }

        if(numDoc.toLowerCase().endsWith("1a2b")){
            System.out.println("Номер документа заканчивается на '1a2b'" );
        } else {
            System.out.println("Номер документа не заканчивается на '1a2b'");
        }


    }


}
