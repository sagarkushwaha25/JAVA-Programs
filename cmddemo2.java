class cmddemo2 {
    public static void main(String[] args) {
        System.out.println(args[0] + args[1]); // 1020

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int res = a + b;
        System.out.println("sum : " + res); // 30
    }
}