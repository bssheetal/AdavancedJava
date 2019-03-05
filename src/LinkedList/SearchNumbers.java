package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchNumbers {

    public void iteratorsearch()
    {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(30);
        list.add(50);
        list.add(100);
        Iterator it=list.iterator();
        System.out.println("Search using iterator search");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
