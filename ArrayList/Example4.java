package ArrayList;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello World");
        list.add("Hii");
        list.add("Hello");
        System.out.println(list.get(0));
        list.set(1, "Hi");
        System.out.println(list);

        for(String greeting: list){
            System.out.println(greeting +"!");
        }
    }
}
