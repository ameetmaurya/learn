package CheckVowel;
import java.util.*;
public class vowel {

    public static void main(String[] args) {
       // char[] vowel = {'a','e','i','o','u'};
        
      System.out.println("Enter any word to check wheather Vowel is present or not");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

 for(int i = 0;i<name.length();i++)
 {
    if(name.charAt(i)=='a'||name.charAt(i)== 'e'|| name.charAt(i)== 'i'|| name.charAt(i)== 'o' ||name.charAt(i)== 'u')
    {
        // System.out.println("Given String contain Vowel"+ name.charAt(i)+"at index"+i);
        System.out.println(name.charAt(i)+"  vowel is present at index  "+ i);
           
    
 } 
  

    
}
}
}
