package dziedziczenie.zad1;

public class kwadrat extends figura{
    public kwadrat(double bokA) {
        super(bokA);
    }
    public double policzpole(){

        return getBokA()*getBokA() ;
    }
}
