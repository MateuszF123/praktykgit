public class zad2 {
    public static void main(String[] args) {
        int a[] = new int[7];
        a[1]=1;
        a[0]=1;
        for (int i=2; i<7; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
        for (int i=0; i<7; i++) {
            System.out.print(a[i] + "\t");
        }

    }
}
