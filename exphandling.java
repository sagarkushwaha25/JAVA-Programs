import java.util.Scanner;

class exphandling {
    void func1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I value");
        int var1 = sc.nextInt();

        System.out.println("Enter II value");
        int var2 = sc.nextInt();

        int result = var1 / var2;
        System.out.println("Division " + result);
        sc.close();
    }

    void func2() {
        System.out.println("Second Function is working");
    }

    public static void main(String[] args) {
        exphandling obj = new exphandling();
        obj.func1();
        obj.func2();
    }
}