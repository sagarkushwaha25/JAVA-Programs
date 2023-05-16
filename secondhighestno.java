
//Q->find the second highest number.
import java.util.*;

class secondhighestno {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the first value: ");
                int var1 = sc.nextInt();
                System.out.println("Enter the second value: ");
                int var2 = sc.nextInt();
                System.out.println("Enter the third value: ");
                int var3 = sc.nextInt();

                if (var1 > var2 && var1 < var3 || var1 < var2 && var1 > var3)
                        System.out.println("Second Highest no is " + var1);
                else if (var2 > var1 && var2 < var3 || var2 < var1 && var2 > var3)
                        System.out.println("Second Highest no is " + var2);
                else
                        System.out.println("Second Highest no is " + var3);
                sc.close();
        }
}