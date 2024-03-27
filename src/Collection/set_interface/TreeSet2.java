package Collection.set_interface;
import java.util.*;
public class TreeSet2 {
    public static void main(String[] args) {

        TreeSet<Student>treeSet=new TreeSet<>();

    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
}