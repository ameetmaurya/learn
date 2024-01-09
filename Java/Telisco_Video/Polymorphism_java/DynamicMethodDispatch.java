package Polymorphism_java;
// class computer{


// }

// class laptop extends computer{

// }

class a
{
   public void show()
   {
    System.out.println("in A show");
   }
}

class b extends a{

       public void show()
   {
    System.out.println("in B show");
   }

}
   class c extends a{

       public void show()
   {
    System.out.println("in C show");
   }
}
public class DynamicMethodDispatch {

    public static void main(String[] args) 
    {
        
        a obj = new a();
        obj.show();

        obj = new b();
        obj.show();

        obj = new c();
        obj.show();
        



        // laptop obj1 = new laptop();
    }
    
}
