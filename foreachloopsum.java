public class foreachloopsum {
    public static void main(String[] args) {
        int sum = 0;
        for (String var : args) {
            System.out.println(var);
            sum = sum + Integer.parseInt(var);
        }
        System.out.println("Sum : " + sum);
    }

}
