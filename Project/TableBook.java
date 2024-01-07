
package Project;
import java.util.Scanner;


    class printTable{
      
      int r;
      int n;

     public void  tab(){
        
     Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
          for(int i =1;i<=10;i++)
          {
        
           System.out.println( n +" * "+ i +" = " + n * i);
           
          }
        
        }


    }
    public class TableBook
{
    public static void main(String[] args) {
        
        printTable table = new printTable();
          
       System.out.println("Enter Table Number");
       table.tab();
     

  
        
       
        


    }
}
    