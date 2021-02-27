package przykłady_od_5_do_8;

public class przykład6 {
    public static void main(String[] args) {
        double[] power={23.45,-2.22,45.90,67.45,234.11,-34.8,90.4,-77};
        double[] odw= new double[power.length];


        for(int i=0;i<8;i++)
        {


            System.out.println("Element [" + i + "]= " + power[i]);

        }
        System.out.println();
        System.out.println("Po odwróceniu ");
        System.out.println();

        for(int i=0;i< power.length;i++)
        {
        odw[i]=power[power.length-1-i];

            System.out.println("Element [" + i + "]= " + odw[i]);

        }






    }
}
