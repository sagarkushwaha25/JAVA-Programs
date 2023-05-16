import java.util.*;

class MINIPROJECT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int) (Math.random() * 100);

        int c = 10;

        do {
            System.out.println("Guess my num: ");
            int usernum = sc.nextInt();

            if (usernum == mynum) {
                System.out.println("CORRECT NUMBER");
                break;
            }

            else if (usernum > mynum) {
                System.out.println("your num is large");
            }

            else {
                System.out.println("your num is small");
            }
            c--;
            System.out.println("Chances remaining = " + c);
        } while (c > 0);

        System.out.println("My number was ");
        System.out.println(mynum);
        sc.close();

    }
}