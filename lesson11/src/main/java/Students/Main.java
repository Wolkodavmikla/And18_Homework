/*
Необходимо создать класс Student со следующими полями
	имя
	пол
	возраст
	список занятий, которые студент посещает (любое представление)
Необходимо заполнить коллекцию несколькими студентами.

Необходимо реализовать следующий функционал
	вывести всех юношей
	найти всех студентов старше 20 лет
	найти всех студентов, которые посещают менее 2 занятий
	найти всех студентов, которые посещают занятие - программирование
 */
package Students;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lessons lesson1 = new Lessons("Math");
        Lessons lesson2 = new Lessons("Physics");
        Lessons lesson3 = new Lessons("Programming");
        Lessons lesson4 = new Lessons("History");

        List<Lessons> lessonsListAll = Arrays.asList(lesson1, lesson2, lesson3, lesson4);
        List<Lessons> lessonsList1 = Arrays.asList(lesson1, lesson3);
        List<Lessons> lessonsList2 = Arrays.asList(lesson1, lesson2, lesson3);
        List<Lessons> lessonsList3 = Arrays.asList(lesson4, lesson3);
        List<Lessons> lessonsList4 = new ArrayList<>();
        lessonsList4.add(lesson4);

        Student student1 = new Student("Masha", Sex.WOMAN, 19, lessonsList1);
        Student student2 = new Student("Misha", Sex.MAN, 21, lessonsList2);
        Student student3 = new Student("Uladzimir", Sex.MAN, 20, lessonsList2);
        Student student4 = new Student("Dominika", Sex.WOMAN, 22, lessonsList3);
        Student student5 = new Student("Eugen", Sex.MAN, 34, lessonsList4);
        Student student6 = new Student("Elena", Sex.WOMAN, 27, lessonsList1);
        Student student7 = new Student("Nikita", Sex.MAN, 22, lessonsList3);
        Student student8 = new Student("Julia", Sex.WOMAN, 29, lessonsList3);
        Student student9 = new Student("Olga", Sex.WOMAN, 41, lessonsList4);
        Student student10 = new Student("Mikhail", Sex.MAN, 18, lessonsList1);
        Student student11 = new Student("Jon", Sex.MAN, 23, lessonsList2);
        Student student12 = new Student("Terminator", Sex.MAN, 22, lessonsList4);
        Student student13 = new Student("DeadPool", Sex.MAN, 17, lessonsList3);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13);

        List<Student> man = new ArrayList<>();

        for(Student student : students){
            if (student.getSex() == Sex.MAN){
                man.add(student);
            }
        }
        System.out.println(man);

        List<Student> ageUp = new ArrayList<>();

        for(Student student : students){
            if (student.getAge() > 20){
                ageUp.add(student);
            }
        }
        System.out.println(ageUp);

        List<Student> studentList = new ArrayList<>();

        for(Student student : students){

            List<Lessons> lesson = student.getLesson();
            if (lesson != null && lesson.size() < 2){
                studentList.add(student);
            }
        }
        System.out.println(studentList);

        for (Student student : students){
            for (Lessons lessons : student.getLesson()){
               if (lessons.getName().equals("Programming")) {
                   System.out.println(student.getName());
                   break;
               }
            }
        }
    }
}
