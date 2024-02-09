package Lamda_Expression;

@FunctionalInterface


 interface A 
    {
        void show( int i); // we also call
    }

    

public class lamda {
    public static void main(String[] args) {

       // lambda exptression
        A obj = (i) -> System.out.println("in a show"+i);
        obj.show(4);
        
    }
    
}
