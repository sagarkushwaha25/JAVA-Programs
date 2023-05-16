//Create a regular java expression that accepts 10 digit numeric characters
import java.util.regex.*;

public class RegexEx7 {
    public static void main(String[] args) {
        System.out.println("by characters and Quantifiers..");

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9988776655"));       //true
        System.out.println(Pattern.matches("[789][0-9]{9}","9988776655"));          //true
        System.out.println(Pattern.matches("[789][0-9]{9}","99887766550"));         //false--11 characters
        System.out.println(Pattern.matches("[789][0-9]{9}","6655443322"));          //false--start from 6
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","8877665544"));       //true

        System.out.println("by metacharacters");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","8877665544"));         //true
        System.out.println(Pattern.matches("[789]{1}\\d{9}","3344556677"));         //false--start from 3

    }
    
}
