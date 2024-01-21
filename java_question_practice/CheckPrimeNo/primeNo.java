package CheckPrimeNo;
import java.util.*;
class prime{
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    public int checkprime()
    {
        if(n%2!=0)
        {
            System.out.println("the given number is prime");
        }
        return 0;
    }
}

public class primeNo
{

    public static void main(String[] args) {
         System.out.println("enter the number");
        prime p = new prime();
        p.checkprime();
        
    }
}