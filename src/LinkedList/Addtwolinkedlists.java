package LinkedList;

import java.util.LinkedList;

public class Addtwolinkedlists {

    public void sumoftwolinkedlists()
    {
        int[] arr1={10,20,30,40};
        int[] arr2={1,2,3,4};
        LinkedList<Integer>list1=new LinkedList<Integer>();
        LinkedList<Integer>list2=new LinkedList<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            list1.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++)
        {
            list2.add(arr2[j]);
        }

        int sum=0;
        for(int i=0;i<list1.size();i++)
        {
            sum=sum+list1.get(i)+list2.get(i);
        }

        System.out.println(sum);
    }

}
