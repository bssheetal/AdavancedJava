package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class SumofOddIntegers {

     public void findsumofintegers()
     {
         int[] numbers={1,1,3,3,1,5,5,5,3,3};
         HashMap<Integer,Integer> oddnocount=new HashMap<Integer,Integer>();
         for(int i=0;i<numbers.length;i++)
         {
             if(!oddnocount.containsKey(numbers[i]))
             {
                 oddnocount.put(numbers[i],1);
             }

             else {
                 oddnocount.put(numbers[i],oddnocount.get(numbers[i])+1);
             }
         }

         int sum=0;
      for(Integer a:oddnocount.keySet())
      {
          if(oddnocount.get(a)%2!=0)
          {

              sum=sum+a*oddnocount.get(a);
          }
      }

      System.out.println(sum);
     }
}
