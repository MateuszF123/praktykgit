package listy.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(100);
        Scanner sc = new Scanner(System.in);
        ;
        String sam="";
        for(int i=0;i< 10;i++)
        {

            System.out.print("Element["+i+"]= ");
sam=sc.next();

           if (!lista.contains(sam)){
               lista.add(i,sam);

           }
           else if (lista.contains(sam)){
                i=i-1;
            }



        }
        System.out.println(lista);

    }
}
