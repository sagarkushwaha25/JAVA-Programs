class nullpointerexp {
    void func() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        nullpointerexp obj = null;
        obj = new nullpointerexp();
        obj.func();
    }

}
