
//Q->print all elements of array using Scanner class 
import java.util.*;

class userinputarray {
    public static void main(String args[]) {
        // int ar[5];
        int ar[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements in array");
        for (int i = 0; i < ar.length; i++) {
            // scanf("%d",&ar[i]);
            ar[i] = sc.nextInt();
        }
        System.out.println("\n----array elements----");
        for (int i = 0; i < ar.length; i++) {
            // printf("%d",ar[i]);
            System.out.println(ar[i]);
        }
        sc.close();
    }
}