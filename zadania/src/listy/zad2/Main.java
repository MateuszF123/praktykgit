package listy.zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {


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


        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            System.out.print("który element chcesz usunąć ");

            lista.remove(sc.nextInt());

        }
        System.out.println(lista);
        }catch (Exception exception){
            System.out.println("error");
        }

    }
}
