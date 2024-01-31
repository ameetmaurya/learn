package Interface;



    
interface A {
    void show();
    void config();

}
class B implements A{

    public void show()
    {
        System.out.println("in Show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}

public class inter {
    public static void main(String[] args) {

        A obj ;
        obj = new B();

        obj.show();
        obj.config();
        
    }
    
}
