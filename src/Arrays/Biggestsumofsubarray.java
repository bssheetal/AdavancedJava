package Arrays;

public class Biggestsumofsubarray {

    public void findbiggestsum()
    {
        int[] numbers={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int biggestsum=0;
        int no1=0;
        int no2=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]>biggestsum)
                {
                    biggestsum=numbers[i]+numbers[j];
                    no1=numbers[i];
                    no2=numbers[j];
                }
            }
        }

        System.out.println("nos are"+no1+"and"+no2);
        System.out.println("Biggest sum is"+biggestsum);
    }
}
