package klasy.zad4;

public class okrąg {
    private double promień;
    private double pole;
    private double średnica;

    public okrąg(double promień) {
        this.promień = promień;
    }

    void setŚrednica() {
        System.out.println(promień * 2);
    }
    void setPole() {
        System.out.println(promień * promień*3.14);
    }
    void obwk() {
        System.out.println(2*3.14*promień);
    }
}

