public class impenum {


    public static void main(String[] args) {

        Direction d = Direction.NORTH;
        d.move();
        

    }
    
}


enum Direction{

    NORTH {                                             //here nrth,south,east,west are objects or ennum that are static and final
                                                        //enum is just another class in java.lang package that helps us in type safety ,increase readability
                                                        //it has multiple methods such as .name, values,valuesOf,toString;

        @Override 
        public void move(){
            System.out.println("Moving North");
        }
    },
    SOUTH  {
        @Override 
        public void move(){
            System.out.println("Moving South");
        }
    
    },
    EAST
    {@Override 
        public void move(){
            System.out.println("Moving East");
        }
    },
    WEST
    {@Override 
        public void move(){
            System.out.println("Moving North");
        }
    };

    public abstract void move();
}