/*
Необходимо создать класс User со следующими полями
	имя - строковой параметр
	профессия - enum (DIRECTOR, WORKER, HR)
	стаж работы - число
Так же надо создать метод который будет выводить зарплату данного пользователя.
Подсчет зп должен учитывать стаж работы и профессию (1000 * стаж работы * коэффициент профессии).

Создайте несколько пользователей с разными параметрами.
Выведете зп каждого сотрудника.

Создайте еще один метод подсчета зп, но он должен принимать параметр - доп оплата
Его задача - подсчитывать ЗП и добавлять к ней доп плату.
Проверить правильность работы данного метода.
 */
package example1;

public class User {
    String name;
    Profession profession;
    int experience;

    public User(String name, Profession profession, int experience){
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }

    public double getSalary(){
        double profCoef;
        switch (profession) {
            case DIRECTOR:
                profCoef = 2.5;
                break;
            case WORKER:
                profCoef = 1.5;
                break;
            case HR:
                profCoef = 2;
                break;
            default:
                profCoef = 1;
        }
        return 1000 * experience * profCoef;

    }
    public double getSavaryBonus(double bonus){
        return getSalary() + bonus;
    }



}
