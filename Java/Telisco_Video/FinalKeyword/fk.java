package FinalKeyword;
 // final keyword use with variable , method, class
  
 // if i use final keyword so no one can extend the class
 // we can use final keyword to stop overriding 

 
 final class calcu{
    public void show()
    {
        System.out.println("in cal show");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
 }



public class fk {

    public static void main(String[] args) 
    {
        calcu obj = new calcu();
        obj.add(2, 2);
        obj.show();
    
    //     final int num = 5; // the variable become constant
    //     // num = 9;
    //     System.out.println(num);


    }
    
}
