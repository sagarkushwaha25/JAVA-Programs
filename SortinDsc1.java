import java.util.*;
public class SortinDsc1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(464);
        l1.add(355);
        l1.add(07);
        l1.add(74);
        l1.add(100);
        System.out.println("Before sorting"+l1);
        
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("After sorting"+l1);
        
    }
    
}
