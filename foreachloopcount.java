public class foreachloopcount {
    public static void main(String[] args) {
        int count = 0;
        for (String var : args) {
            System.out.println(var);
            count++;

        }
        System.out.println("no of elements :" + count);

    }

}
