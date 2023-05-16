
import java.util.*;

class userinput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str1 = sc.next();

        System.out.println("My name is : " + str1);
        sc.close();
    }
}