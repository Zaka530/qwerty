import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.addAll(Arrays.asList(2451, 15, 15, 11, 5, 45, 45, 41, 51, 51, 51, 51, 51, 51));
        System.out.println(numbers);

        List distinctNumbers = (List) numbers.stream().distinct().toList();
        System.out.println(distinctNumbers);
    }
}
