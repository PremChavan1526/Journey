

public class arrnem2 {

    public static void main(String[] args) {
        

        int [][] marks = new int[3][4];

        marks[0][0] =25;     //defining values to 2d array
        marks[0][1] = 35;
        marks [0][2] = 45;
        marks[0][3] = 65;

         marks[1][0] =25;
        marks[1][1] = 35;
        marks [1][2] = 45;
        marks[1][3] = 65;


         marks[2][0] =25;
        marks[2][1] = 35;
        marks [2][2] = 45;
        marks[2][3] = 65;




        for(int row = 0; row<marks.length ; row ++){
            for(int col = 0 ; col< marks[row].length; col ++){
               System.out.print(marks [row][col] + " ");

            }
            System.out.println();

        }



    }
    
}
