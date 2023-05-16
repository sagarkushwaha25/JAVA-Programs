abstract class AKTUnivabs {
    void btech() {
        System.out.println("btech from AKTU");
    }

    abstract void manager(); // declaration
}

class college extends AKTUnivabs {
    // override
    void manager() // defination
    {
        System.out.println("AKTU manager");
    }

    void diploma() {
        System.out.println("Self service");
    }

    public static void main(String[] args) {
        college obj = new college();
        obj.btech();
        obj.manager();
    }
}
