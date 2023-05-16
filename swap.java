public class swap {
    public static void main(String[] args) {
        
        String str1 = "Water";
        String str2 = "Cold Drink";
        String str3 = "Pizza";
        String str4 = "Zoo";
        String temp;

        temp = str3;
        str3 = str4;
        str4 = temp;

        System.out.println("str1 :"+str3 );
        System.out.println("str2 :"+str4);

    }
}

