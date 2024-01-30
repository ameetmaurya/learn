package innerclass;

abstract class A{
    public abstract void show();
  
} 
// class B extends A
// {
//  public void show()
//  {
//     System.out.println("in b Show");
//  }
// }


public class abstractAndanonymous_innerclass {

        public static void main(String[] args) {
            
           
          A obj = new A() 
          {
       
                public void show()
                {
                    System.out.println("in a show");
                }
            };
            
          
          obj.show();
            
          
    
    
        }
        
     }