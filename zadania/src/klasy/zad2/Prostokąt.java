package klasy.zad2;
import static java.lang.Math.*;
public class Prostokąt {

    private int bokA;
    private int bokB;
    private int pole;
    private int przekątne;

    public Prostokąt(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int getPole() {
        return bokA*bokB;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getPrzekątne() {

        return bokA*bokA+bokB*bokB;
    }

    public void setPrzekątne(int przekątne) {
        this.przekątne = przekątne;
    }
}
