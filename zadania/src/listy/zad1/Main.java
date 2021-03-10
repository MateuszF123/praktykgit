package listy.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< 10;i++)
        {

            System.out.print("Element["+i+"]= ");
            lista.add(i,sc.next());
            for (int j=0 ; j<i;j++){
                if (lista.get(i)==lista.get(j)){
                    lista.remove(j);
                    i=i+1;


                }
            }



        }
        System.out.println(lista);

    }
}
