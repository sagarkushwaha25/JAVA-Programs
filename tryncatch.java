import java.util.Scanner;

class tryncatch {
    void func1() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter I value");
            int var1 = sc.nextInt();

            System.out.println("Enter II value");
            int var2 = sc.nextInt();

            int result = var1 / var2;
            System.out.println("Division " + result);
            sc.close();
        } catch (Exception e) {
            // System.out.println("Problem occurs");
            // System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

    void func2() {
        System.out.println("Second Function is working");
    }

    public static void main(String[] args) {
        tryncatch obj = new tryncatch();
        obj.func1();
        obj.func2();
    }
}