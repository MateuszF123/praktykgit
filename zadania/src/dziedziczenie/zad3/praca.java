package dziedziczenie.zad3;

public class praca {
    private int pensja;
    private int etat;
    boolean fajna;
    public void wykonujePrace(){
        System.out.println("Wykonuje pracę");
    }

    public praca(int pensja, int etat, boolean fajna) {
        this.pensja = pensja;
        this.etat = etat;
        this.fajna = fajna;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public boolean isFajna() {
        return fajna;
    }

    public void setFajna(boolean fajna) {
        this.fajna = fajna;
    }
}
