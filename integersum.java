import java.util.*;

class integersum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int var1 = sc.nextInt();
        System.out.println("Enter second value ");
        int var2 = sc.nextInt();
        int sum = var1 + var2;
        System.out.println("sum : " + sum);
        sc.close();
    }

}