package Arrays;

public class RemoveDuplicates {

//    Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//
//    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    public int removesuplicatesfunc(int[] numbers)
    {
        int idx=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(i>0 && numbers[i]==numbers[i-1])
            continue;
            numbers[idx++]=numbers[i];
        }
        return idx;
    }
}
