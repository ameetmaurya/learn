package exception;

import java.util.Scanner;

class NegativeSalaryMessage extends Exception{
    NegativeSalaryMessage(String message){
    super(message);
    }
}
public class prac11 {
 public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
   
    try{
    System.out.println("employee name:");
    String name=sc.nextLine();

    System.out.println("enter salary:");
    double salary=sc.nextDouble();

    if(salary<0)
    {
        throw new NegativeSalaryMessage("salary cannot be negatce");
    }

    System.out.println("name:"+name);
    System.out.println("salary:"+salary);
    
 }catch(NegativeSalaryMessage e)
 {

 
  System.out.println("error"+e.getMessage());
 }
 }   
}
