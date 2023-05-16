import java.util.*;

public class Votingage {
    public static void main(String[] args) {
        System.out.println("What is your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello " + name);
        System.out.println("How old are you " + name);
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("Ohh..You are " + age + " year old.\nYou are eligible for voting.");
        else
            System.out.println("SORRY " + name + "\nYou are not eligible for voting.");
        sc.close();

    }

}
