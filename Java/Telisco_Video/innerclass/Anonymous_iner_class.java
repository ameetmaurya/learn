package innerclass;


class A{
    public void show()
    {
        System.out.println("in a show");
    }
}


public class Anonymous_iner_class {
      
    public static void main(String[] args) {
        
        // Anonymus class
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in show");
            }
        };            //...........
        obj.show();


    }
    
 }
