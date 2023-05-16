import java.util.regex.*;

public class RegexEx2 {
    public static void main(String args[]) {
        System.out.println(Pattern.matches(".s", "as"));         // true--second char is s
        System.out.println(Pattern.matches(".s", "mk"));         // false--secpnd char is not s
        System.out.println(Pattern.matches(".s", "mst"));        // false--it has more than 2 char
        System.out.println(Pattern.matches(".s", "amms"));       // false--it has more than 2 char
        System.out.println(Pattern.matches("..s", "mas"));       // true--third char is s
        System.out.println(Pattern.matches(".as", "aas"));       // true--third char is s
    }

}
