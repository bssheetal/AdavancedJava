package Misc;

public class Singleton {

   public static void Main(String[] args)
   {
       Abc obj1=Abc.getinstance();
       Singleton2 x=Singleton2.getInstance();
       Singleton2 y=Singleton2.getInstance();
   }
}

class Abc{

    static Abc obj=new Abc();

    private Abc()
    {

    }

    public static Abc getinstance()
    {
        return obj;
    }
}