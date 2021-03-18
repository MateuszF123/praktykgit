package projekt;

import java.util.*;

public class Main {
     public static void main(String[] args) {
         produkty produkty=new produkty();
         dane dane=new dane();
         Scanner sc = new Scanner(System.in);
         produkty.uzupełnienie();
         produkty.uzupełnienie1();



         List<String> produktdodwkoszyku = new ArrayList<>(5);
         List<Double> cenywkoszyku=new ArrayList<>(5);




         do {
             try {

                 System.out.println("Dzień Dobry. Witamy w naszym sklepie. Ile pieniedzy masz na zakupy ");
                     dane.pieniadze =Math.abs(sc.nextDouble());
                     System.out.println("na zakupy możesz wydać " + dane.pieniadze + " zł");
                     dane.run=false;
             } catch (Exception exception) {
                 System.out.println("błedne dane spróbój ponownie");
                 sc.next();
             }
         }while (dane.run);



         do {
             try {


                 while (dane.pobieradan) {

                     produkty.kreska();
                     produkty.menu();

                     dane.opcja = sc.next();
                     produkty.kreska();
                     dane.cenazazakupy=0;
                     switch ( dane.opcja) {
                         case "0" -> {
                             produkty.pokazanieproduktów();
                             System.out.println("który produkt chcesz dodać");
                             dane.c= sc.nextInt();

                             System.out.println("ile "+produkty.produktdodw.get(dane.c)+" chcesz dodać do koszyka");
                             dane.x= sc.nextInt();
                             if (dane.x>0){
                                 produktdodwkoszyku.add(produkty.produktdodw.get(dane.c));
                                 cenywkoszyku.add(produkty.ceny.get(dane.c)* dane.x);
                                 System.out.println("dodałeś "+produkty.produktdodw.get(dane.c)+" w cenie "+produkty.ceny.get(dane.c)+" zł");
                             }
                             if (dane.x==0){
                                 System.out.println("nie możesz dodać 0 produktów do koszyka ");
                             }




                             break;
                         }
                         case "1" -> {

                             for (int i = 0; i<cenywkoszyku.size(); i++){
                                 dane.cenazazakupy=dane.cenazazakupy+cenywkoszyku.get(i);
                             }
                             System.out.println("cena za zakupy wynosi "+ dane.cenazazakupy+"zł masz "+ dane.pieniadze+"zł czy chcesz zapłacić [tak][nie]");

                             dane.sd=sc.next();


                             if (dane.sd.equals("tak")){
                                 if (dane.cenazazakupy< dane.pieniadze)
                                 {
                                     System.out.println("udało ci się zapłacić za zakupy");
                                     produkty.kreska();
                                     dane.pobieradan=false;
                                 }
                                 if (dane.cenazazakupy> dane.pieniadze)
                                 {
                                     System.out.println("nie masz tyle pieniedzy żeby zapłacić");

                                 }

                             }
     break;
                         }
                         case "2" -> {

                             dane.pobieradan=false;
                             break;
                         }
                         case "3" -> {
                             System.out.println("który produkt chcesz usunąć");
                             System.out.println(produktdodwkoszyku);
                             dane.c=sc.nextInt();
                             produktdodwkoszyku.remove(dane.c);
                             cenywkoszyku.remove(dane.c);

                             break;
                         }
                         case "4" -> {
                             System.out.println("czy chcesz usunąć wszysko[tak][nie]");

                             dane.sd=sc.next();

                             if (dane.sd.equals("tak")){
                                 produktdodwkoszyku.clear();
                                 cenywkoszyku.clear();
                                 System.out.println("usunąłeś wszystkie produkty");
                             }


                             break;
                         }
                         case "5" -> {
                             System.out.println("ilość produktów w koszyku "+produktdodwkoszyku.size());

                             break;
                         }
                         case "6" -> {
                             for (int i = 0; i<cenywkoszyku.size(); i++){
                                 dane.cenazazakupy=dane.cenazazakupy+cenywkoszyku.get(i);
                             }
                             System.out.println("cena za produkty w koszyku wynosi "+dane.cenazazakupy+" zł");
                             dane.cenazazakupy=0;

                             break;
                         }
                         case "7" -> {
                             System.out.println("w koszyku masz ");
                             System.out.println(produktdodwkoszyku);
                             break;
                         }
                         case "8" -> {
                             System.out.println("podaj nazwe produktu które chcesz sprawdzić czy jest:  ");
                             System.out.println(produktdodwkoszyku.contains(sc.next()));
                             break;
                         }
                         case "9" -> {
produkty.pokazanieproduktów9();

                             break;
                         }
                         case "10" -> {
                             System.out.println("na zakupy możesz wydać maksymalnie "+dane.pieniadze+" zł");

                             break;
                         }
                         case "11" -> {
                             System.out.println("podaj ilość pieniedzy jakie masz na zakupy");
                             dane.pieniadze =Math.abs(sc.nextDouble());
                             System.out.println("na zakupy możesz wydać " + dane.pieniadze + " zł");

                             break;
                         }
                         default -> {
                             System.out.println("złe dane");
                             break;
                         }

                     }



                 }

             } catch (Exception exception) {
                 System.out.println("błedne dane spróbój ponownie");
                 sc.next();
             }
         }while (dane.pobieradan);

         System.out.println("wyszedłeś ze sklepu");
}}
