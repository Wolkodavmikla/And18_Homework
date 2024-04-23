package example2;

public class RAM {
    String name;
    int capacity;

    public RAM() {
    }


    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

    }
    public void dispInfo(){
        System.out.println("RAM: " + name + ", Объем: " + capacity + "Гб");
    }

}

