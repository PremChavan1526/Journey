package day2;

public class recurr {

    public static void main(String[] args) {
        
        int x = 5;
        printNum(x);
    }
    

    static void printNum(int x){
            if(x==0) {
                return;
            }
            printNum(x-1);
            System.out.println(x);


    }
}
