import java.util.Scanner;
public class exphandlingcatch2 {
        void func1() {
            try {
                int ar[] = new int[5];
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array elements : ");
                for (int i = 0 ; i < 5 ; i ++){
                    ar[i] = sc.nextInt();
                }
                System.out.println("-------ARRAY-------");
                for (int i = 0 ; i < 5 ; i ++){
                    System.out.println(ar[i]/i);
                }
    
                sc.close();
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Array problem occur..... : " + ae);
            }
            catch (ArithmeticException e) {
                System.out.println("Division problem occur....");
            }
        }
    
        void func2() {
            System.out.println("Second Function is working");
        }
    
        public static void main(String[] args) {
            exphandlingcatch2 obj = new exphandlingcatch2();
            obj.func1();
            obj.func2();
        }
    }
