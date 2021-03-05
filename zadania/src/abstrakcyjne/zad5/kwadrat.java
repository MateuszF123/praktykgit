package abstrakcyjne.zad5;

public class kwadrat implements Obliczeniadlafigur{
    private double bokA;



    @Override
    public void obliczpole() {
        System.out.println( bokA*bokA);

    }

    @Override
    public void olbliczobw() {
        System.out.println(bokA*4);
    }

    public kwadrat(double bokA) {
        this.bokA = bokA;
    }
}
