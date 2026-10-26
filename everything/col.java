package everything;

import java.util.*;

public class col {


    public static void main(String[] args) {
        
        Collection <Integer> list = new ArrayList<>();   //it doesn't matter which type of refernce variable we give the code will shiow no change
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
    
}
