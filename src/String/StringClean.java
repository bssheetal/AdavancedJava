package String;

public class StringClean {

    public void cleanstring(String stmt)
    {
        String sen=stmt.replaceAll("[0-9]", "");
        System.out.println(sen);

    }
}
