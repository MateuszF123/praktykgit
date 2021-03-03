package dziedziczenie.zad1;

public class Main
{
        public static void main(String[] args) {
            kwadrat kwadrat=new kwadrat(4);
            System.out.println("pole kwadratu "+kwadrat.policzpole());
            System.out.println();
            prostokąt prostokat=new prostokąt(4,2);
            System.out.println("pole prostokąta "+prostokat.policzpole());

        }
}
