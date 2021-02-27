package przykłady_od_5_do_8;

import java.util.Random;

public class przyklad7 {
    public static void main(String[] args) {

        double[] power={23.45,-2.22,45.90,67.45,-56,234.11,-34.8,90.4,-77};
        Random random = new Random();
        int w,z;

            w = random.nextInt(9);
            z = random.nextInt(9);

        if (power[w]==power[z]){
            System.out.println("liczba "+power[w]+ " jest równa liczby "+power[z]);
        }
           else if (power[w]>power[z]){
                System.out.println("liczba "+power[w]+ " jest wieksza od liczby "+power[z]);
            }
            else{
                System.out.println("liczba "+power[z]+ " jest wieksza od liczby "+power[w]);
            }




    }
}
