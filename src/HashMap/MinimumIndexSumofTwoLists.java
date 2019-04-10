package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MinimumIndexSumofTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2)
    {
        HashMap<String,Integer>map1=new HashMap<String,Integer>();
        HashMap<Integer,LinkedList<String>> resultmap=new HashMap<Integer,LinkedList<String>>();
        int resultindex=0;
        int minindex=0;
        for(int i=0;i<list1.length;i++)
        {
            map1.put(list1[i],i);
        }
        int max_value= list2.length;
        for(int i=0;i<list2.length;i++)
        {


            System.out.println("Value in map1 that matches map2 is"+list2[i]+"common value"+map1.containsKey(list2[i]));
            if(map1.containsKey(list2[i]))
            {
                System.out.println("Value of i in list2 is"+i);
                System.out.println("Value of i in list1"+map1.get(list2[i]));
                resultindex= i+map1.get(list2[i]);
                LinkedList<String>curlist=resultmap.get(resultindex);
                if(curlist==null)
                {
                    LinkedList<String>list=new LinkedList<>();
                    list.add(list2[i]);
                    resultmap.put(resultindex,list);
                }

              else
                {
                    curlist.add(list2[i]);
                    resultmap.put(resultindex,curlist);
                }
            }
        }


        LinkedList<String>result=null;
        int curmin= Integer.MAX_VALUE;
        for(Map.Entry<Integer,LinkedList<String>> entry:resultmap.entrySet())
        {
            if(entry.getKey()<curmin)
            {
                curmin=entry.getKey();
                result=entry.getValue();
            }
        }

        return result.toArray(new String[0]);
    }
}
