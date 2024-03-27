package Collection.set_interface;
import java.util.*;
public class HashSetEx {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Kamron");
        set.add("Igor");
        //System.out.println(set);

        for(String s:set ){
            System.out.println(s);
        }
    }
}
