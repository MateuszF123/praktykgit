package klasy.zad4;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        prostykalkulator prostykalkulator=new prostykalkulator(6,2);
        Scanner sc = new Scanner(System.in);
        boolean działaprogram=true;
        while(działaprogram)
        {
            System.out.print("dodawanie[1]odejmowanie[2]mnozenie[3]dzielenie[4]wyłącz[5]: ");
            String userInput = sc.next();
            System.out.println("podaj pierwszą liczbę ");
            double licz1 = sc.nextDouble();
            System.out.println("podaj drugą liczbę ");
            double licz2 = sc.nextDouble();

            prostykalkulator.setA(licz1);

            prostykalkulator.setB(licz2);


            switch (userInput)
            {
                case "1": {
                    prostykalkulator.dodawanie();
                    break;
                }
                case "2": {
                    prostykalkulator.odejmowanie();
                    break;
                }
                case "3": {
                    prostykalkulator.mnożenie();
                    break;
                }
                case "4": {
                    prostykalkulator.dzielenie();


                    break;
                }
                case "5": {
                    działaprogram = false;
                    break;
                }
                default: {
                    System.out.println("Wybrałeś złą liczbę1!");
                }
            }
        }


    }
}
