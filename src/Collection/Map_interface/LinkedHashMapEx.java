package Collection.Map_interface;
import java.util.*;
public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Double,Student>lhm=new LinkedHashMap<>();

        Student st1=new Student("Zaur","Tregulov",3);
        Student st2=new Student("Mariya","Ivanova",1);
        Student st3=new Student("Sergey","Petrov",4);
        Student st4=new Student("Igor","Sidirov",2);
        lhm.put(5.8,st1);
        lhm.put(6.4,st2);
        lhm.put(7.2,st3);
        lhm.put(7.5,st4);


        System.out.println(lhm);
        System.out.println(lhm.get(5.8));




    }
}
