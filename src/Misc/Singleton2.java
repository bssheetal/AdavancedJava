package Misc;

public class Singleton2 {



    private static Singleton2 app;
    private Singleton2()
    {

    }

    public static Singleton2 getInstance()
    {
        if(app==null)
        {
            app=new Singleton2();
        }

        return app;
    }
}
