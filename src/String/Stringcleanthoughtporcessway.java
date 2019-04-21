package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Stringcleanthoughtporcessway {

    // initialize the array that will be returned as the response
    // take the input string and loop through it
    // while looping push anything that is not a string numerical value to a new array
    // this array can then be joined and returned as the clean string


    public void rmspcl(String sen)
    {
        ArrayList<Character> list=new ArrayList<Character>();

        for(int i=0;i<sen.length();i++)
        {
            if(!(sen.charAt(i)>='0' && sen.charAt(i)<='9') )
            {

                list.add(sen.charAt(i));

            }

        }

        Object[] ob=list.toArray();
        String newsen=Arrays.toString(ob);
//        System.out.println(newsen);
        String joinedstring=String.join("",newsen);
        joinedstring=joinedstring.substring(1,joinedstring.length()-1);
//        String lateststr=joinedstring.join(",",joinedstring);
        String lateststr=joinedstring.replaceAll(",","");
        System.out.println(lateststr);




    }

}
