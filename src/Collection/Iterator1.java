package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        Iterator iterator=arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();

        }

        System.out.println(arrayList1);
    }
}
