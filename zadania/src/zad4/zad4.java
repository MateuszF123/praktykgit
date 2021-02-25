package zad4;

public class zad4
    {
        public static void main(String[] args)
        {



            for (int i = 1; i < 10; i++)
            {
                for (int j = 1; j <10; j++)
                {
                    int wynik=i*j;
                    System.out.print(wynik +"\t");

                }
                System.out.println();
            }
            System.out.println();
            for (int i = 1; i < 10; i++)
            {
                for (int j = 1; j <10; j++)
                {
                    int wynik=i*j;
                if (wynik % 2==0 && wynik % 3==0){
                    wynik=i*j;
                      System.out.print(wynik+"\t");
                  }
                  else{
                      System.out.print("x"+"\t");
                  }

                }
                System.out.println();
            }
            System.out.println();












        }
    }
