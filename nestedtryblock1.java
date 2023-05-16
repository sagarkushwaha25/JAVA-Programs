public class nestedtryblock1 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to divide by 0");
                int a = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int arr[] = new int[5];
                arr[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("handled the exception of outer block");
        }
        System.out.println("rest of the code");
    }

}
