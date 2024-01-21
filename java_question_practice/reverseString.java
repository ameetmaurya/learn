


public class reverseString {
    public static void main(String[] args) {
        
     String name = "Ameet";
     String  rstr=  "";


     System.out.println(name.charAt(0));
     for(int i = 0;i<name.length();i++)
     {
        
        System.out.println(name.charAt(i));

        rstr =  name.charAt(i)+rstr;
       
        
     }

     System.out.println("your name reverseString is:");

  
     System.out.println(rstr);



    }
    
}
