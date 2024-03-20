package Collection;
import java.util.*;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String>arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        List<String>mylist=arrayList1.subList(1,4);
        System.out.println(mylist);

        mylist.add("Fedor");
        System.out.println(mylist);
        System.out.println(arrayList1);
    }
}
