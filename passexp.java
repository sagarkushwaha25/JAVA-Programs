class PassException extends Exception {
    PassException() {
        System.out.println("Pass exp problem");
    }
}

class passexphandling {
    void func() {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Enter pass");
            String pass = sc.next();
            int x = pass.length();
            sc.close();

            if (x >= 15 && x <= 8 ) {
                throw new PassException();
            } else {
                System.out.println("Password : "+pass);
            }
        } catch (PassException ne) {
            System.out.println(ne);
        } finally {
            System.out.println("Next pass");
        }
    }

    public static void main(String[] args) {
        passexphandling obj = new passexphandling();
        obj.func();
    }

}
