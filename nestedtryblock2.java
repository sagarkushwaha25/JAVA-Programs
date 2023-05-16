public class nestedtryblock2 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

}
