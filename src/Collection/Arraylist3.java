package Collection;
import java.util.*;
public class Arraylist3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

    }
}
