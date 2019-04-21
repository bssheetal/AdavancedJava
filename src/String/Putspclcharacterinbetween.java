package String;

import java.util.ArrayList;

public class Putspclcharacterinbetween {

    public void putspecialcharacter()
    {
       String sentence="This is awesome";
        ArrayList list=new ArrayList();
        for(int i=0;i<sentence.length();i++)
        {
            list.add(sentence.charAt(i));
//            list.add(",");
        }

        String correctsentence=list.toString();
        String removebrackets=correctsentence.substring(1,correctsentence.length()-1);
        String removecomma=removebrackets.replaceAll(",","#");
        System.out.println(removecomma);

    }
}
