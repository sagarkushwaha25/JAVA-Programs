
//Q->print & sum all elements of array
import java.util.*;

class sumofarray {
      public static void main(String args[]) {
            int ar[] = new int[5];
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 5 elements in array");
            for (int i = 0; i < ar.length; i++) {
                  ar[i] = sc.nextInt();
            }
            int sum = 0;
            System.out.println("\n----array elements----");
            for (int i = 0; i < ar.length; i++) {
                  // printf("%d",ar[i]);
                  System.out.println(ar[i]);
                  sum = sum + ar[i];
            }
            System.out.println("Total sum of array : " + sum);
            sc.close();

      }
}