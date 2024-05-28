/*
Создать коллекцию пользователей
У каждого пользователя есть следующие поля:
	имя (не уникальное)
	стаж работы (пусть будет уникальное для всех)
	список задач (любое представление - можно строками, можно обьектами)
Найти всех пользователей, у которых количество задач больше 2
Вывести всех пользователей по стажу работы (от большего к меньшему)
Вывести только уникальные имена пользователей
Используйте для этого наиболее подходящие коллекции
 */
package example1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TaskList taskList1 = new TaskList("laying tiles");
        TaskList taskList2 = new TaskList("foundation preparation");
        TaskList taskList3 = new TaskList("walling");
        TaskList taskList4 = new TaskList("waterproofing");
        TaskList taskList5 = new TaskList("door installation");

        Set<User> userSet = new HashSet<>();

        userSet.add(new User("Petr", 7, List.of(taskList1, taskList2)));
        userSet.add(new User("Pasha", 12, List.of(taskList3, taskList5, taskList1)));
        userSet.add(new User("Egor", 4, List.of(taskList3, taskList4)));
        userSet.add(new User("Igor", 8, List.of(taskList3, taskList2, taskList5, taskList4)));
        userSet.add(new User("Ivan", 9, List.of(taskList1, taskList4,taskList3)));
        userSet.add(new User("Petr", 10, List.of(taskList5)));
        userSet.add(new User("Kirill", 2, List.of(taskList3, taskList4)));

        Set<User> userMoreTwoTasks = new HashSet<>();
        for (User user : userSet){
            if (user.getTasks().size() > 2){
                userMoreTwoTasks.add(user);
            }
        }
        System.out.println("\nПользователи с количеством задач больше 2:");
        for (User user : userMoreTwoTasks){

            System.out.println(user.getName() + " - " + user.getTasks().size() + " tasks");
        }

        TreeSet<User> sortedUsers = new TreeSet<>(userSet);
        System.out.println("\nПользователи, упорядоченные по стажу работы (от большего к меньшему:");
        for (User user : sortedUsers){
            System.out.println(user.getName() +  " - " + user.getExperience() + " age experience");
        }

        Set<String> uniqueNames = new HashSet<>();
        for (User user : userSet) {
            uniqueNames.add(user.getName());
        }
        System.out.println("\nУникальные имена пользователей:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }










    }

}
