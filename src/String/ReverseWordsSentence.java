package String;



public class ReverseWordsSentence {

    public static void main(String args[])
    {
        String sentence="Let's take LeetCode contest";
        ReverseWordsSentence callmethod=new ReverseWordsSentence();
        System.out.println(callmethod.reverseWords(sentence));

    }

    public String reverseWords(String s) {

        String words[] = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words)
        {
            sb.append(new StringBuilder(word).reverse()+" ");

        }
        return sb.toString().trim();
    }
}
