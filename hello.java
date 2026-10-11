class hello{

public static void main(String args[]){

    int a = 23;
    int b = 39;
System.out.println("Hello World");
System.out.println("Prem");
System.out.println("21");
System.out.println("B.Tech");

hello obj = new hello();
// int sum = obj.add(a,b); 
// int difference = obj.sub(a,b);
// int product = obj.mul(a,b);     
// int quotient = obj.div(a,b);
// int remainder = obj.mod(a,b);

hello.biggest();
obj.display();
obj.count();
obj.evenOdd();

// System.out.println("Sum: " + sum);
// System.out.println("Difference: " + difference);
// System.out.println("Product: " + product);
// System.out.println("Quotient: " + quotient);
// System.out.println("Remainder: " + remainder);
}


public int add(int a, int b){
    return a+b;


}

public int sub(int a, int b){
    return a-b;
}

public int mul(int a, int b){
    return a*b;
}

public int div(int a, int b){
    return a/b;
}

public int mod(int a, int b){
    return a%b;

}

public void display(){
    int i = 56;


    int res = i>0? 1: 0;

    if (i>0){
        System.out.println("Positive");
    }
    else if (i<0){
        System.out.println("Negative");
    }
    else{
        System.out.println("Zero");
    }

}

 public static void biggest(){

    int i= 56;
    int j= 89;

    int result = i>j? i:j;
     System.out.println("Biggest: " + result);
   
    
 }


 public void count()
 {
    for (int i=0;i<=100;i++)
    {
        System.out.println(i);
    }

 }


 public void evenOdd()
 {
    for (int i=0;i<=100;i++)
    if (i%2==0)
    {
        System.out.println("Even number is: " + i);
    }
    else
    {
        System.out.println("Odd number is: " + i);
    }
 }

}