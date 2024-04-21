package example;

import java.util.Objects;

public class Person {

        String name;
        int age;
        double salary;
        Cat cat;

        public Person(String name, int age, double salary, Cat cat){
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
                (cat != null ? cat.equals(person.cat) : person.cat == null);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        long temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (cat != null ? cat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat=" + (cat != null ? cat.getName() : "нет кота") +
                '}';
    }
}

