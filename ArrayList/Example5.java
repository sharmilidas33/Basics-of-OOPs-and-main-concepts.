package ArrayList;
import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        ArrayList <String> ul= new ArrayList <String> ();
        ul.add("Mithai");
        ul.add("Sharmili");
        ul.add("Soham");
        ul.add("Moly");
        System.out.println(ul);

        ListIterator <String> itr= ul.listIterator(ul.size());
        while (itr.hasPrevious()) {
            String str= itr.previous();
            System.out.println(str);
        }

        for(int i=0;i<ul.size();i++){
            System.out.println(ul.get(i));
        }
    }
}
