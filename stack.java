import java.util.*;

class stack {
    void func() {
        Stack stk = new Stack();

        stk.push("Frooti");
        stk.push("Maggie");
        stk.push(10);
        stk.push(5.6);
        stk.push("Coke");

        System.out.println(stk);
        System.out.println("Nos - " + stk.size());

        System.out.println("\n\n----------------\n\n");

        // System.out.println("Deleted - " + stk.pop());
        System.out.println("Last element: " + stk.peek());

        System.out.println(stk);
        System.out.println("Nos - " + stk.size());
    }

    public static void main(String[] args) {
        stack obj = new stack();
        obj.func();
    }
}
