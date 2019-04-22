package Arrays;

public class SumofTwoElements {

    public void sumofelemetsresultsintarget()
    {
        int[] numbers={1,3,5,6,4};
        int target=10;
        int no2=0;
        int no1=0;
        for(int i=0;i<numbers.length;i++)
        {

            no2=target-numbers[i];
            no1=numbers[i];
            for(int j=0;j<numbers.length;j++)
            {
                if(no2==numbers[j] && no1!=no2)
                {
                    System.out.println("no1 is"+no1+"no2 is"+no2);
                }
            }
        }
    }
}
