package dziedziczenie.zad3;

public class spawacz extends praca{

    boolean niebezpieczna;
    @Override
    public void wykonujePrace(){
        System.out.println("zmiana danych");
    }

    public spawacz(int pensja, int etat, boolean fajna, boolean niebezpieczna) {
        super(pensja, etat, fajna);
        this.niebezpieczna = niebezpieczna;
    }

    public boolean isNiebezpieczna() {
        return niebezpieczna;
    }

    public void setNiebezpieczna(boolean niebezpieczna) {
        this.niebezpieczna = niebezpieczna;
    }
}
