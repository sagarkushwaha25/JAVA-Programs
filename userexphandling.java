class AgeException extends Exception {
    AgeException() {
        System.out.println("Under 18 problem");
    }
}

class userexphandling {
    void func() {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Enter your age");
            int age = sc.nextInt();
            sc.close();

            if (age >= 18) {
                System.out.println("Vote done");
            } else {
                throw new AgeException();
            }
        } catch (AgeException z) {
            System.out.println(z);
        } finally {
            System.out.println("Next voter will come");
        }
    }

    public static void main(String[] args) {
        userexphandling obj = new userexphandling();
        obj.func();

    }
}
