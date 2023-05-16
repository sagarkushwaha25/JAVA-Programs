import java.util.*;

class set {
    void func() {
        Set st = new HashSet();

        st.add("Coke");
        st.add("Perk");
        st.add("2000");
        st.add("6.5");

        if (st.contains("Maggie")) {
            System.out.println("Found");
        } else {
            System.out.println(st);
            System.out.println("Not Found");
        }

    }

    public static void main(String[] args) {
        set obj = new set();
        obj.func();

    }
}