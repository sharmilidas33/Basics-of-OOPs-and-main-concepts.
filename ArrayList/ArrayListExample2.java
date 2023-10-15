package ArrayList;
import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList <String> list= new ArrayList <String> ();
        list.add("Mango");
        list.add("Apple");
        list.add("Grapes");
        list.add("Pinapple");
        System.out.println("Arraylist:"+list);

        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
