package salonsamochodowy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String sam = "";
            int z=0;
            List<String> auta = new ArrayList<>(100);
        List<String> lista = new ArrayList<>(11);
        lista.add(0,"[0] dodaj auto");
        lista.add(1,"[1] dodaj auto po indeksie");
        lista.add(2,"[2] podmień auto po indeksie");
        lista.add(3,"[3] usuń auto po indeksie");
        lista.add(4,"[4] usuń auto po nazwie");
        lista.add(5,"[5] sprawdz czy dane auto jest");
        lista.add(6,"[6] posortowanie auta");
        lista.add(7,"[7] wyciągniecie auta po indeksie i wyświetlenie nazwy");
        lista.add(8,"[8] Wyświetlenie liczby aut");
        lista.add(9,"[9] usuniecie wszystkich aut");
        lista.add(10,"[10] wyświetl wszystkich aut");
        lista.add(11,"[11] wyjście");
        Scanner sc = new Scanner(System.in);
        boolean programrun = true;

        while(programrun)
        {
            System.out.println("wybierz jedną z opcji:");
            for (int i=0;i<12;i++) {
                System.out.println(lista.get(i));
            }
            int opcja1=0;
            opcja1= sc.nextInt();

            switch (opcja1)
            {
                case 0: {
                    System.out.println("podaj nazwę nowego auta ");
                    sam=sc.next();
                   auta.add(sam);
                    System.out.println("dodano nowe auto "+sam);
                    break;
                }
                case 1: {
                    System.out.println("podaj indeks dla nowego auta ");

                    z=sc.nextInt();
                    System.out.println("podaj nazwę nowego auta ");
                    sam=sc.next();
                    auta.add(z,sam);
                    System.out.println("dodano nowe auto "+sam+" na pozycji "+z);
                    break;
                }
                case 10: {
                    System.out.println(auta);
                    break;
                }

                case 8: {
                    System.out.println("liczba aut ");
                    System.out.println(auta.size());
                    break;
                }
                case 7: {
                    System.out.println("lista aut ");
                    System.out.println(auta);
                    System.out.println("wybierz auto podając indeks ");
                    z=sc.nextInt();
                    System.out.println("wybrano auto "+ auta.get(z));
                    break;
                }
                case 6: {
                    System.out.println("lista aut przed sortowaniem ");
                    System.out.println(auta);
                    System.out.println("Po sortowaniu ");

                    Collections.sort(auta);
                    System.out.println(auta);
                    break;
                }
                case 5: {
                    System.out.println("podaj nazwe auta które chcesz sprawdzić czy jest:  ");
                    System.out.println(auta.contains(sc.next()));



                    break;
                }
                case 2: {
                    System.out.println("podaj index dla nowego auta:  ");
                    z=sc.nextInt();
                    System.out.println("podaj nazwę dla nowego auta:  ");
                    sam=sc.next();
                    auta.set(z,sam);
                    System.out.println("zamieniono auto na nowe : "+sam+" na pozycję "+z);



                    break;
                }
                case 3: {
                    System.out.println("podaj index auta które chcesz usunąć:  ");
                    z=sc.nextInt();
                    System.out.println("usunięto auto  : "+auta.get(z)+" na pozycję "+z);
                    auta.remove(z);

                    break;
                }
                case 4: {
                    System.out.println("podaj nazwe auta które chcesz usunąć:  ");
                    sam=sc.next();
                    System.out.println("usunięto auto  : "+sam);
                    auta.remove(sam);

                    break;
                }
                case 9: {
                    System.out.println("czy napewno chcesz usunąć wszystkie auta? tak[y] nie [n] ");
                    sam=sc.next();

                    if (sam.equals("y")){

                       auta.clear();
                    }


                    break;
                }
                case 11: {
                   programrun=false;


                    break;
                }

            }
        }
        }catch (Exception exception){
            System.out.println("złe podane dane");
        }
    }
}
