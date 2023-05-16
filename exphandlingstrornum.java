import java.util.Scanner;

class exphandlingstrornum {
    void func1() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value");

            String var = sc.next();
            System.out.print("String value :");

            System.out.println(var);

            System.out.println("\n--------------------------------\n");

            int z = Integer.parseInt(var);
            System.out.print("Numberic value :");
            System.out.println(z);

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void func2() {
        System.out.println("Second Function is working");
    }

    public static void main(String[] args) {
        exphandlingstrornum obj = new exphandlingstrornum();
        obj.func1();
        obj.func2();
    }
}