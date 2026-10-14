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


        //boolean contains(Object o) --> 1,2,3  -->equals();

        System.out.println(c.contains(2));



        Object[] obj = c.toArray();
        for( Object o : obj){

            System.out.println(o);
        }
    }
    
}
