package przykłady_od_5_do_8;

public class przykład5 {
    public static void main(String[] args) {
        double[] power={23.45,-2.22,45.90,67.45,-56,234.11,-34.8,90.4,-77};
        double max=0;
        double min=0;
        int MIN=0;
        int MAX=0;

        for(int i=0;i<9;i++)
        {            if(max<power[i]){
                max=power[i];
            MAX=i;

            }
            if(min>power[i]){
                min=power[i];
            MIN=i;
            }


            System.out.println("Element ["+i+"]= "+power[i]);

        }
        System.out.println();
        System.out.println("po zamianie najwiekszej z najmniejszą miejscami");
        System.out.println();


        for(int i=0;i<9;i++)
        {
            power[MIN]=max;
            power[MAX]=min;

            System.out.println("Element ["+i+"]= "+power[i]);

        }


    }
}
