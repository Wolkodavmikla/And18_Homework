package example2;

public class HDD {
    String name;
    int capacity;
    String type;

    public HDD(){
    }

    public HDD(String name, int capacity,String type){
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
    public void dispInfo(){
        System.out.println("HDD: " + name + ", Объем: " + capacity + " Гб, Тип: " + type);
    }
}
