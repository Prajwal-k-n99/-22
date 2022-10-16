import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList <Integer> l2 = new LinkedList<>();
        l1.add(7);
        l1.add(8);
        l1.add(5);
        l1.add(3);
        l1.add(2);
        l2.add(5);
        l2.add(1);
        l2.add(9);
        System.out.println(l1.contains(12));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(4));
        l1.set(3,125);
        for (int i = 0;i<l1.size(); i++){
            System.out.println(l1.get(i));
            System.out.println(",");
        }
        for (int j=0;j<l2.size();j++){
            System.out.println(l2.get(j));
            System.out.println(",");
            System.out.println(l2.size());
        }
    }
}


