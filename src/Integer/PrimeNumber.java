package Integer;

public class PrimeNumber {

    public boolean isPrimeno(int number)
    {
       for(int i=2;i<number;i++)
       {
           if(number% i==0)
           {
               return false;
           }
       }
       return true;
    }
}
