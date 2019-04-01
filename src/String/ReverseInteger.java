package String;

public class ReverseInteger {

    public long reverse(long x) {

        long rev=0;
        long a;
        while(x!=0)
        {
            a=x%10;
            rev=rev*10+a;
            x=x/10;
        }
        return rev;
    }
}
