package This_and_Super;

class a 
{
    public a()
    {
        super();
        System.out.println("in a");

    }

    public a(int n)
    {
        super();
        System.out.println("in a int");
    }
}

class b extends a 
 {

    public b()
    {
        super();
        System.out.println("in b");

    }
    public b (int n)
    {
        super(n);
        System.out.println("in b int");
    }

}

public class ts {

    public static void main(String[] args) {

        b obj = new b();

        
    }
    
}
