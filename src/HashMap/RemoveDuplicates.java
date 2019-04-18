package HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

    public void removesuplicatesfunc(int[] numbers)
    {
        HashSet<Integer> removeduplicates=new HashSet<Integer>();
        HashSet<Integer> newset=new HashSet<Integer>();
        for(int i=0;i<numbers.length;i++)
        {
            removeduplicates.add(numbers[i]);
        }

        Iterator<Integer>itr=removeduplicates.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }


}
