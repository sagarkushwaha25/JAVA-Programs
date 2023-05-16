import java.util.*;
public class SortinAsc {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("A");
        l1.add("D");
        l1.add("Z");
        l1.add("G");
        l1.add("K");
        System.out.println("Before sorting"+l1);
        Collections.sort(l1);
        System.out.println("After sorting"+l1);
    }
    
}
