package Arrays;

public class RemoveDuplicates {

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
