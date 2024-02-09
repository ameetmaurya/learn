package Interface;
  
 @FunctionalInterface // this use beacuse if we use this so we can only use one function ,if tryed to do so error will ocur
 interface A{
   
    void show();
 }
//  class B implements A{
//     public void show()
//     {
//         System.out.println("in a show");
//     }
//  }


public class funtional_interface {
    public static void main(String[] args) {

        // A obj = new B();
        // obj.show(); 


        // anouymous inner class
        A obj = new A() {
            public void show()
                {
                    System.out.println("in a show");
                }
        };
        obj.show();
        
    }
    
}
