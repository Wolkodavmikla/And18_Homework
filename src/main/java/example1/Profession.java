package example1;

public enum Profession {

    DIRECTOR(2.5),
    HR(2),
    WORKER(1.5);

    private final double profCoef ;

    Profession(double profCoef){
        this.profCoef = profCoef;
    }
    public double getProfCoef(){
        return profCoef;
    }


}
