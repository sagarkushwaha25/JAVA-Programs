interface AKTU {
    abstract void btech();
     static void func() {
        System.out.println("static func is working in interface");
    }
}

class college3 implements AKTU {
    public void btech() {
        System.out.println("btech program");
    }

    public static void main(String args[]) {
        college3 obj = new college3();
        obj.btech();
    }
}