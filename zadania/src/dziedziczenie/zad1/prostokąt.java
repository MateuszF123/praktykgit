package dziedziczenie.zad1;

public class prostokąt extends figura{
    private double bokB;

    public prostokąt(double bokA, double bokB) {
        super(bokA);
        this.bokB = bokB;
    }

    public double policzpole(){

        return getBokA()*getBokB() ;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
}
