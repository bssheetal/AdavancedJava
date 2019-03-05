package LinkedList;

import java.util.LinkedList;

public class InsertingData {

    public static void main(String args[])
    {
        LinkedList<Integer> numbers =new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(1);
        System.out.println(numbers);
        /*Search numbers*/
        for(int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)==4)
            {
                System.out.println("Number exists in index"+" "+i);
            }
        }

    }


}
