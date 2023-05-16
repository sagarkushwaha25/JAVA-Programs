import java.util.*;

class list {
    void func() {
        List lst = new ArrayList();

        lst.add("Coke");
        lst.add("DairyyMilk");
        lst.add(500);
        lst.add(7.9);
        lst.add(7.9);

        System.out.println(lst);
        System.out.println("No. of items: " + lst.size());

        System.out.println("\n\n--------------------------------\n\n");

        //System.out.println(lst.get(1));         //find
        //lst.set(1, "KitKat");                   //replace
        //lst.add("Frooti");                      //insert in the end
        //lst.add(1,"Milk");                      //insert at particular index
        //lst.remove(1);                          //delete particular index
        lst.clear();                              //delete all items

        System.out.println(lst);
        System.out.println("No. of items: " + lst.size());
    }

    public static void main(String[] args) {
        list obj = new list();
        obj.func();
    }
}
