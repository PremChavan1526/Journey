

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



            //here lets define arrays of different length here 

            int[][] marksnew = new int[3][];


            marksnew[0] = new int[1];   // here we are defining the number of columns in the array marksnew[0] or we are defining length iof array 0 here
            marksnew[1] = new int[2];
            marksnew[2] = new int[3];

            marksnew[0][0] = 25;
            marksnew[1][0] =65;
            marksnew[1][1] = 34;
            marksnew[2][0] = 98;
            marksnew[2][1] = 76;
            marksnew[2][2] =35;


            for(int row =0; row< marksnew.length ; row ++){
                for (int col = 0; col< marksnew[row].length; col++)
                {
                    System.out.print(marksnew[row][col] + " ");
                }
                        System.out.println( );
            }



                        //we can also define array like this
                        //also int [] = {12,12,12} we can also do this
                        int[] [] marksnw = {
                            {101,102,120},
                            {201,292,202},
                            {302,203,430},
                        };
                         for(int row =0; row< marksnw.length ; row ++){
                for (int col = 0; col< marksnw[row].length; col++)
                {
                    System.out.print(marksnw[row][col] + " ");
                }
                        System.out.println( );
    }
    
}}
