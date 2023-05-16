class NameException extends Exception {
    NameException() {
        System.out.println("Name exp problem");
    }
}

class nameexphandling {
    void func() {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Enter name");
            String name = sc.next();
            sc.close();

            if (name == null) {
                throw new NameException();
            } 
            else {
                System.out.println("Name: " + name);
            }
        } 
        catch (NameException ne) {
            System.out.println(ne);
        } 
        finally {
            System.out.println("Next candidate");
        }
    }

    public static void main(String[] args) {
        nameexphandling obj = new nameexphandling();
        obj.func();
    }

}
