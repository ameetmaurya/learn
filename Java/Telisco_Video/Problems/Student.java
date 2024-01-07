package Problems;

import java.util.Scanner;


      
    class Board{
        int player_1  = 1;
        public void myboard(){

                 int board[][] = new int[3][3];
              

        for(int row = 0;row<board.length;row++)
        {
            for(int col = 0;col<board.length;col++)

            {
                 System.out.print(board[row][col]+ " ");
            }
            System.out.println();
        }

       
        // board[0][0]= 'X';
        
        }
      
    }
   
     public class Student {
    public static void main(String[] args) {
 
        Board board = new Board();
        board.myboard();

      

      
        
    }
}