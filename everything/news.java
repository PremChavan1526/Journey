package everything;

import java.util.ArrayList;
import java.util.List;

public class news {
 
    
    public static void main(String[] args) {
        


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.set(1, 5);    ///adds 5 to index 1
        System.out.println(list);
        list.indexOf(2);
        System.out.println(list);
    }
}
