package wyjątki.zad2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            int[] tablica = new int[4];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {


                tablica[i] = scanner.nextInt();
                System.out.println("tablica[" + i + "] ma wartość " + tablica[i]);
            }
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("błedne liczby");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("przekroczona wielkość tablicy");
        }
        }

}
