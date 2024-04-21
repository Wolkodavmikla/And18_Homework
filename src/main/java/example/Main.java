package example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Myrzik");
        Person person1 = new Person("Ivan",22,3500.0,cat);

        Person person2 = new Person(person1.name, person1.age, person1.salary, person1.cat);
        person2.name = "Fill";

        System.out.println("Оригинальный объект: "+ person1);
        System.out.println("Копия объекта: " + person2);

        System.out.println("Сравнение объектов: " + person1.equals(person2));

    }
}
