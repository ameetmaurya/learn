package exception;

import java.util.Scanner;

import javax.naming.AuthenticationException;

class AuthenticaatedFaliure extends Exception
{
   AuthenticaatedFaliure(String message)
   {
    super(message);
   }
}


public class password {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    String password =sc.nextLine();

    try{
        if(!password.equals("msbte"))
        {
            throw new AuthenticaatedFaliure("Autgthicated faliyre ,password does ot match");
        }
        else{
            System.out.println("Password match successfully");
        }
    }
    catch(AuthenticaatedFaliure e){
        System.out.println("Error"+e.getMessage());

    }
}
}