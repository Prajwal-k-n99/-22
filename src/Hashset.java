import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet <Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(4);
        myHashSet.add(1);
        System.out.println(myHashSet);
    }
}
