package wyjątki.zad1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
try {


    int[] tablica = new int[10];

    Random random = new Random();


    for (int i = 0; i < 11; i++) {


        tablica[i] = random.nextInt(99);
        System.out.println(tablica[i]);
    }
}
catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
    System.out.println("tablica jest już pełna nie moźna wpisać wiecej danych");
}
    }

}
