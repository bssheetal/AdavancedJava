package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Sorting {

    public void comparatortosort()
    {
        LinkedList<Integer> sortthelist=new LinkedList<Integer>();
        sortthelist.add(430);
        sortthelist.add(50);
        sortthelist.add(00);
        Collections.sort(sortthelist);
        System.out.println("Sortedlist is"+sortthelist);
        Collections.sort(sortthelist, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.print("Descending order is"+sortthelist);
    }

}
