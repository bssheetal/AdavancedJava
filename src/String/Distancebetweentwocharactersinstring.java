package String;

public class Distancebetweentwocharactersinstring {

    public void finddistance()
    {
        //find distance between L and t
        //Get character L-0 and t-3
        //
        String word="Leet";
        int s1=0;
        int s2=0;
        int distance=0;
        for(int i=0;i<word.length();i++)
    {
        if((word.charAt(i)=='L'))
        {
            s1=i;
        }
        if((word.charAt(i)=='t'))
        {
            s2=i;
        }
    }

        if(s2>s1)
        {
             distance=s2-s1;
        }

        else{
            distance=s1-s2;
        }

        System.out.println(distance);
    }

}
