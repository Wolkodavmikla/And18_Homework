package example;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Myrzik");
        Person person = new Person("Ivan",22,3500.0,cat);

        Person clonePerson = person.clone();
        clonePerson.name = "Fill";

        System.out.println("Оригинальный объект: "+ person);
        System.out.println("Копия объекта: " + clonePerson);

        System.out.println("Сравнение объектов: " + person.equals(clonePerson));

    }
}
