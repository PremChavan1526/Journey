import java.util.ArrayList;
import java.util.Collection;

public class dd {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);


        //size
        int n =c.size();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
    
}
