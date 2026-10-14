import java.util.*;

class Inneriteimp {

}

public class iteimp {

    public static void main(String[] args) {
        String[] name = {"Prem","Aditya","Om","Something"};

        NameContainer container = new NameContainer(name);

        // Iterator<String> it =container.iterator();


        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //Enhanced for loop
        for(String names : container){

            System.out.println(names);
        }
    }
}

class NameContainer implements Iterable<String> {

    private String[] name;
    private int size;

    NameContainer(String[] name) {
        this.name = name;
        this.size = (name == null) ? 0 : name.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new NameContainerIterator();
    }

    private class NameContainerIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return name[index++];
        }
    }
}
