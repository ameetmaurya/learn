package exception;

import java.util.Scanner;

class NoMachException extends Exception
{
  NoMachException(String message)
  {
    super(message);
  }
}

public class msbte {
    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the password");
String input = sc.nextLine();

    try{
        if(!input.equals("msbte"))
        {
            throw new NoMachException("password does not match");
        }
        else{
            System.out.println("passsord is correct");
        }
    }
    catch(NoMachException e){
        System.out.println("Error"+ e.getMessage());

    }
}
}
