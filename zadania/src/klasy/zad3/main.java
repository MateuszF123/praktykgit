package klasy.zad3;

import klasy.zad1.Trójkąt;
import klasy.zad2.Prostokąt;

public class main {
    public static void main(String[] args) {
        Prostokąt prostokąt=new Prostokąt(2,2);
        Trójkąt trojkat=new Trójkąt(3,2,30);
        if(trojkat.getBokA()== prostokąt.getBokA()) System.out.println("boki są równe");
        else if (trojkat.getBokA()> prostokąt.getBokA())System.out.println("bok trójkąta jest dłuźszy");
        else System.out.println("bok prostkąta jest dłuźszy");
        System.out.println("bok prostokąta "+prostokąt.getBokA());
        System.out.println("bok trójkąta "+trojkat.getBokA());
    }
}
