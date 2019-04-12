package String;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        char[] letters=words[words.length-1].toCharArray();
        return letters.length;

    }
}
