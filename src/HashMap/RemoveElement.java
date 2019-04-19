package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        HashMap<Integer,Integer> dupelements=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            dupelements.put(i,nums[i]);
        }

        return dupelements.size();

    }
}
