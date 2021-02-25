package zad3;
import java.util.Scanner;

public class zad3 {


        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            boolean programrun = true;

            while(programrun)
            {
                System.out.print("Podaj numer drzwi (1-5): ");
                String userInput = sc.next();

                switch (userInput)
                {
                    case "1": {
                        System.out.println("drzwi numer 1 są złe ");
                        break;
                    }
                    case "2": {
                        System.out.println("drzwi numer 2 są złe ");
                        break;
                    }
                    case "3": {
                        System.out.println("drzwi numer 3 są złe ");
                        break;
                    }
                    case "4": {
                        programrun = false;

                        break;
                    }
                    case "5": {
                        System.out.println("drzwi numer 5 są złe ");
                        break;
                    }
                    default: {
                        System.out.println("Wybrałeś złe drzwi !");
                    }
                }
            }

            System.out.println("Wybrałeś dobre drzwi");
        }
    }