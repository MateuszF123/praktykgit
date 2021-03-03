package dziedziczenie.zad2;

public class zwierze {
    private int wiek;
    private int ilośćkonczyn;
    private String nazwa;

    public zwierze(int wiek, int ilośćkonczyn, String nazwa) {
        this.wiek = wiek;
        this.ilośćkonczyn = ilośćkonczyn;
        this.nazwa = nazwa;
    }
    public void dajgłos() {
        System.out.println("daje głos");
    }


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getIlośćkonczyn() {
        return ilośćkonczyn;
    }

    public void setIlośćkonczyn(int ilośćkonczyn) {
        this.ilośćkonczyn = ilośćkonczyn;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
