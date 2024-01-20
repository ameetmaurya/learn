package java_question_practice.swapNumber;
 
import java.util.*;;
public class swap {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int inputA = sc.nextInt();
        System.out.println("Enter the Second Number");
        int inputB = sc.nextInt();
        int inputc;

        System.out.println("Value of a is: "+inputA +" Value of b is : "+inputB+" Before Swapping");

         inputc = inputA;
         inputA=inputB;
         inputB = inputc;

         System.out.println("Value of a is: "+inputA+ " Value of b is: "+inputB+" After Swapping");
    }
    
}
