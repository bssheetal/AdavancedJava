package Integer;

public class Fibonacci {

    public int Fibonacci(int no)
    {

        if(no==0)
        {
            return 0;
        }
        if(no==1)
        {
            return 1;
        }

        else
        {
            return Fibonacci(no-1)+Fibonacci(no-2);
        }
    }
}
