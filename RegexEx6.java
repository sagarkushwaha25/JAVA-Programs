//Create a regular expression that accepts alphanumeric characters only
import java.util.regex.*;

public class RegexEx6 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","2haRAD"));     //true
        System.out.println(Pattern.matches("[0-9]{10}","9876543210"));      //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkvarun32"));  //true-- more than 6 characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2Uk2"));     //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2"));     //false--$ is not matched
    }
    
}
