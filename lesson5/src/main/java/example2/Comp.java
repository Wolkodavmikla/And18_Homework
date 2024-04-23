/*
Создать класс для описания компьютера, в этом классе должны быть
поля: стоимость, модель(строковый тип), RAM и HDD.
Для полей RAM и HDD следует создать свои собственные классы.
Классы для RAM и HDD должны иметь конструктор по умолчанию и
конструктор со всеми параметрами.
Класс RAM имеет поля "название" и "объем".
Класс HDD имеет поля "название", "объем" и "тип" (внешний или
внутренний).
Класс Computer должен иметь два конструктора:
- первый - с параметрами стоимость и модель,
- второй - со всеми полями.
При создании объекта "компьютер" с помощью первого конструктора
должны создаваться поля RAM и HDD с помощью конструкторов по
умолчанию.
В каждом из классов предусмотреть методы для вывода полной
информации (вывод всех полей и всех значений).
Тестовый сценарий для проверки:
создать объект "компьютер 1" с помощью первого конструктора и
вывести информацию на экран;
создать объект "компьютер 2" с помощью второго конструктора и
вывести информацию на экран.
 */
package example2;

public class Comp {
    double price;
    String model;
    RAM ram;
    HDD hdd;

    public Comp(double price, String model){
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();

    }
    public Comp(double price, String model, RAM ram, HDD hdd){
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;

    }
    public void dispInfo(){
        System.out.println("Модель: " + model);
        System.out.println("Стоимость: "+ price);
        ram.dispInfo();
        hdd.dispInfo();
    }

    public static void main(String[] args) {
        Comp Comp1 = new Comp(990,"Lenovo LOQ ");
        Comp1.dispInfo();

        RAM ram2 = new RAM("Kingston",8);
        HDD hdd2 = new HDD("Seaatge", 1000,"Внутренний");
        Comp Comp2 = new Comp(1300,"HP Victus", ram2, hdd2);
        Comp2.dispInfo();
    }
}


