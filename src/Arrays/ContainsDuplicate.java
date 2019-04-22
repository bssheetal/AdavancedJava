package Arrays;

import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args)
    {
        Biggestsumofsubarray findbigsum=new Biggestsumofsubarray();
        findbigsum.findbiggestsum();
        SumofTwoElements sumof=new SumofTwoElements();
        sumof.sumofelemetsresultsintarget();
        ContainsDuplicate findduplicate=new ContainsDuplicate();
          int[] numbers={1,3,5};
          System.out.println(findduplicate.containsDuplicate(numbers));
          RemoveDuplicates rm=new RemoveDuplicates();
          rm.removesuplicatesfunc(numbers);
        RemoveElement rmelement=new RemoveElement();
        rmelement.removeElement(numbers,2);
        SearchInsertPosition ip=new SearchInsertPosition();
        System.out.println(ip.searchInsert(numbers,4));
    }

    public boolean containsDuplicate(int[] nums) {
        int count =0;
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }

            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(HashMap.Entry<Integer,Integer>duplicatentry:map.entrySet())
        {
            if(duplicatentry.getValue()>1) {
                return true;
            }
        }

        return false;
    }
}
