import java.util.*;
public class SortinDsc {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("ACV");
        l1.add("SFS");
        l1.add("FAS");
        l1.add("SFG");
        l1.add("SGSDG");
        System.out.println("Before sorting"+l1);
        
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("After sorting"+l1);
        
    }
    
}
