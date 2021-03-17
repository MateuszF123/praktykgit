package projekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class produkty {
    List<String> produktdodw = new ArrayList<>(5);
    List<Double> ceny=new ArrayList<>(5);
    public void pokazanieproduktów(){

        for (int i=0;i<produktdodw.size();i++) {
            System.out.println("naciśnij "+i+" "+produktdodw.get(i)+" "+ceny.get(i)+" zł");

        }

        kreska();



    }
    public void pokazanieproduktów9(){
        System.out.println("w sklepie jest ");
        for (int i=0;i<produktdodw.size();i++) {

            System.out.println(produktdodw.get(i)+" "+ceny.get(i)+" zł");

        }





    }

    public void uzupełnienie(){

        produktdodw.add("mleko");
        produktdodw.add("chleb");
        produktdodw.add("opakowanie sera");
        produktdodw.add("opakowanie płatków kukurydzianych");
        produktdodw.add("jogurt");
        produktdodw.add("kurczak");
        produktdodw.add("pomidor");
        produktdodw.add("czekolada");
        produktdodw.add("opakowanie ryżu");
        produktdodw.add("sałata");
        produktdodw.add("chipsy");
        produktdodw.add("butelka wody");
        produktdodw.add("kostka masła");





    }
    public void uzupełnienie1(){


        ceny.add(4.2);
        ceny.add(2.2);
        ceny.add(4.5);
        ceny.add(4.7);
        ceny.add(1.5);
        ceny.add(10.5);
        ceny.add(2.45);
        ceny.add(4.99);
        ceny.add(7.8);
        ceny.add(3.4);
        ceny.add(4.6);
        ceny.add(1.6);
        ceny.add(5.0);





    }


    public void menu(){
        List<String> menu = new ArrayList<>(11);
        menu.add(0, "[0]dodaj produkt");
        menu.add(1, "[1]idz do kasy");
        menu.add(2, "[2]Wyjdz ze sklepu");
        menu.add(3, "[3] usuń produkt ");
        menu.add(4, "[4]usuń wszystko z koszyka");
        menu.add(5, "[5] Wyświetlenie liczby produktów w koszyku");
        menu.add(6, "[6] Wyświetlenie ceny");
        menu.add(7, "[7] wyświetl wszystkie produkty w koszyku");
        menu.add(8, "[8] sprawdz czy dany produkt jest w koszyku");
        menu.add(9, "[9] pokaż produkty dostępne w sklepię");
        menu.add(10, "[10] pokaż ile pieniedzy masz na zakupy");
        menu.add(11, "[11] zmień ilość pieniedzy na zakupy");
        System.out.println("wybierz jedną z opcji:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));

        }
    }
    public void kreska() {
        System.out.println("-----------------------------------------------------------");}

}


