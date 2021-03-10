package listy.zad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(10);

        lista.add(0,"0");
        lista.add(1,"1");
        lista.add(2,"2");
        lista.add(3,"3");
        lista.add(4,"4");
        lista.add(5,"5");
        lista.add(6,"6");
        lista.add(7,"7");
        lista.add(8,"8");
        lista.add(9,"9");
        String pierwszy;
        String drugi;

        int p=0;
        int d=0;


        Scanner sc = new Scanner(System.in);

            System.out.print("który element chcesz zamienić ");
          p=sc.nextInt();
          d=sc.nextInt();
        pierwszy=lista.get(p);
        drugi=lista.get(d);
        lista.set(p,drugi);
        lista.set(d,pierwszy);
        System.out.println(lista);
        }
}
