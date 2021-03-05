package abstrakcyjne.zad4;

public class Pies extends zwierze implements Zwierzedomowe{

    @Override
    public void bawsie() {
        System.out.println("bawi się");
    }

    @Override
    void badzmilutki() {
        System.out.println(" jest milutki");
    }
}
