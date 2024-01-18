package innerclass;
 
class a{
     int age;
     public void show()
     {
          System.out.println("in show");
     }
    class b{
      
        public void config()
        {
            System.out.println(" in config");
        }

    }
}

public class ic {
    public static void main(String[] args) {
        a obj = new a();
        obj.show();

        a.b obj1 = obj.new b();
        obj1.config();

        
    }
    
}

