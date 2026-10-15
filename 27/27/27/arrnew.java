

public class arrnew {

    public static void main(String[] args) {

        int[] rollNum = new int[3];
        

            int x = 101;   // printing array using loop 


            for (int i = 0 ; i<rollNum.length ; i++){      // for taking input of array here

                rollNum[i] = x;
                x++;

            }

             for (int i = 0 ; i<rollNum.length ; i++){

                System.out.println(rollNum[i]);

            }


    }
    
}
