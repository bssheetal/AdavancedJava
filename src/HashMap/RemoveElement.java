package HashMap;

import java.util.HashSet;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        HashSet<Integer> dupelements=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            dupelements.add(nums[i]);
        }

        return dupelements.size();

    }
}
