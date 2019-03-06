package HashMap;

import java.util.HashMap;


public class InsertingFindDuplicate {


    public static void main(String [] args)
    {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        map.put(1,2);
        map.put(2,3);
        map.put(1,3);
       for(HashMap.Entry<Integer,Integer> entry:map.entrySet())
       {
           System.out.println("Key is"+entry.getKey()+" "+"Value is"+entry.getValue());
       }

       int[] numbers={20,10,10,20,2};
       HashMap<Integer,Integer> duplicates=new HashMap<Integer,Integer>();
       int count=0;
       for(int i:numbers)
       {
          if(duplicates.containsKey(i))
          {
              duplicates.put(i,duplicates.get(i)+1);
          }

          else{
              duplicates.put(i,1);
          }

       }

       for(HashMap.Entry<Integer,Integer>duplicatentry:duplicates.entrySet())
       {
           if(duplicatentry.getValue()>1)
           {
               System.out.println("Duplicates are"+duplicatentry.getKey());
           }
       }
    }
}
