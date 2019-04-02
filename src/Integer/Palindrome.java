package Integer;

public class Palindrome {


    public static void main(String[] args)
    {
       Palindrome checknoisPalindrome=new Palindrome();
       int number=19;
       System.out.println(checknoisPalindrome.isPalindrome(number));
       PrimeNumber findprime=new PrimeNumber();
       System.out.println(findprime.isPrimeno(number));
    }

    public boolean isPalindrome(int x) {

        int nocopy=x;
        int rev=0;
        while(x!=0)
        {

            int remainder=x%10;
            rev=rev*10+remainder;
            x=x/10;
        }

        if(nocopy<0)
        {
            return false;
        }
        if(nocopy==rev)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

}
