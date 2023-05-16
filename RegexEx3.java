import java.util.regex.*;

public class RegexEx3 {
    public static void main(String args[]) {
        System.out.println(Pattern.matches("[amn]", "abcd"));   //false--not a or m or n 
        System.out.println(Pattern.matches("[amn]", "a"));      //true--among a or m or n  
        System.out.println(Pattern.matches("[amn]", "ammmma")); //false--a and m comes more than once 
        
    }

}
