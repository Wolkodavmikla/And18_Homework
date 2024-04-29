package example;

import java.util.Objects;

public class Person {

    String name;
    int age;
    double salary;
    Cat cat;

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                name.equals(person.name) &&
                cat.equals(person.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, cat);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat=" + cat +
                '}';
    }

    public Person clone() {
        Cat clonedCat = new Cat(cat.getName());
        return new Person(name, age, salary, clonedCat);
    }
}

