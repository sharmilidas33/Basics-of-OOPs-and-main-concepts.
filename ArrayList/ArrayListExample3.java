package ArrayList;
import java.util.*;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Pink");
        list.add("Green");
        list.add("Yellow");
        list.add("Purple");
        list.add("Blue");
        System.out.println("ArrayList: "+list);

        for(String colour:list){
            System.out.println(colour);
        }

    }
}
