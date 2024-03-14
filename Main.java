import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        BigInteger size=new BigInteger(in.nextLine());
        ArrayList numbers=new ArrayList();

        for(BigInteger i=BigInteger.ZERO;i.compareTo(size)<0;i=i.add(BigInteger.ONE)){
            numbers.add(i);
            System.out.println(numbers);
        }
    }
}