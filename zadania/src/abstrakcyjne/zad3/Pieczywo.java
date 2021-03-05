package abstrakcyjne.zad3;

abstract public class Pieczywo {
    abstract public void jasne();
    abstract public void ciemne();


    public  void ziarnami()
    {
        System.out.println("Pieczywo z ziarnami");
    }
    public  void bezziaren()
    {
        System.out.println("Pieczywo bez ziaren");
    }


}
