package Class_and_object;

 class Calculator{

    public int add(int n,int m)

    {
        int r = n+m;
        return r;
    }
 }
public class co {

    public static void main(String[] args) {
           
        int num1 = 4;
        int num2 = 3;

        Calculator cal = new Calculator();
        int result = cal.add(num1,num2 );

        System.out.println(result);
        
    }
    
}
