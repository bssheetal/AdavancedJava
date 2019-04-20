package Arrays;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;

            }

        }
if(nums.length>1)
{
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            } else if (target < nums[i]) {
                return i;
            } else if (target > nums[i + 1] && target<nums[i+2] && target < nums[nums.length - 1]) {
                return i + 2;
            } else if (target > nums[nums.length - 1]) {
                return nums.length ;
            }
        }
    }


    if(target < nums[0]){
        return 0;
    }else {
        return nums.length;
    }


    }
}
