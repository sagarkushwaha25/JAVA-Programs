import java.util.regex.*;
public class RegexEx4 {
    public static void main(String[] args) {
        System.out.println("?  Quantifier");

        System.out.println(Pattern.matches("[amn]?", "a"));             //true--a or m or n comes one time    
        System.out.println(Pattern.matches("[amn]?", "aaa"));           //false--a comes more than one time       
        System.out.println(Pattern.matches("[amn]?", "ammmmann"));      //false--a m and n comes one time
        System.out.println(Pattern.matches("[amn]?", "abcd"));          //false--a comes more than one time
        System.out.println(Pattern.matches("[amn]?", "aazzta"));        //false--a or m or n must come one time 
    
        System.out.println("+  Quantifier");
        System.out.println(Pattern.matches("[amn]+", "a"));             //true--a or m or n once or more than one time
        System.out.println(Pattern.matches("[amn]+", "aaa"));           //true--a comes more than one time 
        System.out.println(Pattern.matches("[amn]+", "ammmmann"));      //false--a or m or n comes more than once 
        System.out.println(Pattern.matches("[amn]+", "aazzta"));        //false--z and t are not matching pattern
    
        System.out.println("*  Quantifier");
        System.out.println(Pattern.matches("[amn]*", "ammma"));         //true--a or m or n come zero or more times
    }
}
