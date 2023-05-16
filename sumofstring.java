//Q-> sum of two values which input by Scannerimport java.util.Scanner;
import java.util.*;
class sumofstring
{
            public static void main(String args[])
            {
                         Scanner sc = new Scanner(System.in);

                         System.out.println("Enter first value");
                         String str1 = sc.next();
                         int var1 = Integer.parseInt(str1);
 
                         System.out.println("Enter second value ");
                         String str2 = sc.next();
                         int var2 = Integer.parseInt(str2);

                         int sum = var1+var2;
                         System.out.println("sum: "+sum);
                         sc.close();
             }
}
                         