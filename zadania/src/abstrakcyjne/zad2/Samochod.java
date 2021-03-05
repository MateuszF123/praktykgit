package abstrakcyjne.zad2;

public class Samochod implements Pojazd{
    @Override
    public void skrecwlewo() {
        System.out.println("skręca w lewo");
    }

    @Override
    public void skrecwprawo() {
        System.out.println("skręca w prawo");
    }
}
