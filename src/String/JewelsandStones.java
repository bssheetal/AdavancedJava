package String;

import java.util.HashMap;

public class JewelsandStones {

    public int numJewelsInStones(String J, String S)
    {
        int count=0;
        HashMap<Character,Boolean>map=new HashMap<Character,Boolean>();
        for(char j:J.toCharArray())
        {
            map.put(j,true);
        }
       for(char s:S.toCharArray())
       {
           if(map.containsKey(s))
           {
               count++;
           }
       }

       return count;
    }
}
