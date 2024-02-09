package Lamda_Expression;


interface A {

    int add(int i ,int j);

    
}

public class lamwtihreturn {
    public static void main(String[] args) {
         
        //anonymouis inner class
        // A obj = new A() {
        //     public int add(int i,int j)
        //     {
        //             return i+j;
        //     }
        // };
        
        // int result = obj.add(12, 13);
        // System.out.println(result);

   //     lambda now

   A obj = (int i ,int j) -> i+j;  //return value

   int result = obj.add(12, 4);
   System.out.println(result);
    }    
}
