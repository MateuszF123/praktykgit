package dziedziczenie.zad2;

public class pies extends zwierze{
    private String sierść;
    private int długośćogona;

    public pies(int wiek, int ilośćkonczyn, String nazwa, String sierść, int długośćogona) {
        super(wiek, ilośćkonczyn, nazwa);
        this.sierść = sierść;
        this.długośćogona = długośćogona;
    }


    public void dajgłos() {
        System.out.println("Hau Hau");
    }


    public String getSierść() {
        return sierść;
    }

    public void setSierść(String sierść) {
        this.sierść = sierść;
    }

    public int getDługośćogona() {
        return długośćogona;
    }

    public void setDługośćogona(int długośćogona) {
        this.długośćogona = długośćogona;
    }
}
