package example1;

public class Wage {
    public static void main(String[] args) {
        User user1 = new User("Анатолий",Profession.DIRECTOR,5  );
        User user2 = new User("Григорий", Profession.HR,7);
        User user3 = new User("Ольга", Profession.WORKER, 3);

        System.out.println("Зарплата сотрудников: ");
        System.out.println("Анатолий: " + user1.getSalary());
        System.out.println("Григорий: " + user2.getSalary());
        System.out.println("Ольга: " + user3.getSalary());

        double bonus = 500;
        System.out.println("Зарплата сотрудников с бонусом: " + bonus);
        System.out.printf("Анатолий: %s рублей\n", user1.getSavaryBonus(bonus));
        System.out.printf("Григорий: %s рублей\n", user2.getSavaryBonus(bonus));
        System.out.printf("Ольга: %s рублей\n", user3.getSavaryBonus(bonus));
    }
}
