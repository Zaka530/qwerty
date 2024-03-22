package Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;

public class ListIterator1 {
    public static void main(String[] args) {
        String s="madam";
        List<Character> list=new LinkedList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }

        System.out.println(list);

        ListIterator<Character> iterator=list.listIterator();
        ListIterator<Character> reverseIterator=list.listIterator(list.size());
        boolean isPalindrom=true;
        while (iterator.hasNext()&&reverseIterator.hasPrevious()){
            if (iterator.next()!=reverseIterator.previous()){
                isPalindrom=false;
                break;

            }
        }
        if (isPalindrom) {

            System.out.println("Paindrom ");

        }
        else {
            System.out.println("Not Palindrom");
        }


    }
}
