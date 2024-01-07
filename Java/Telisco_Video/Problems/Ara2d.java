package Problems;


class Sum{

    public void Addition()   {
         int count = 0;
         int add = 0;
        int num[][] = new int[3][5];
        for(int row = 0;row<3;row++)
        {
            for(int col= 0;col<4;col++)
            {
                count = count + num[row][col];
                count++;
                
              System.out.print(count + " ");
        
            }
            System.out.println();

         
          
        }
       
    }
    
   
}

public class Ara2d{

    public static void main(String[] args) {
        
        Sum  add = new Sum();
        add.Addition();
    }
    
}
