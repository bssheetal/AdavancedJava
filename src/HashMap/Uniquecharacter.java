package HashMap;

import java.util.HashMap;

public class Uniquecharacter {

    public int firstUniqChar(String s) {


        HashMap<Character,Integer>map=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
           if(!map.containsKey(ch))
           {
               map.put(ch,1);
           }
           else
           {
               map.put(ch,map.get(ch)+1);
           }
        }
       for(int i=0;i<s.length();i++)
       {
           int count=map.get(s.charAt(i));
           if(count==1)
           {
               return i;
           }


       }
        return -1;

    }
}
