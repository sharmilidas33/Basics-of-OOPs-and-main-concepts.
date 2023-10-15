package ArrayList;
import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList <Integer> ();
        list.add(56);
        list.add(5);
        list.add(23);
        list.add(39);
        list.add(24);
        System.out.println("ArrayList: "+list);

        Collections.sort(list);
        for(Integer number: list){
            System.out.println(number);
        }
    }
}
