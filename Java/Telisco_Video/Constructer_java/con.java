package Constructer_java;


class Human{
    int age;
    String name;

    public Human(){
        age = 12;
        name  = "Ameet";
    }

        // public int  getAge()
        // {
        //     return age;
        // }
        // public void setAge(int a)
        // {
        //  age = a;
        // }


    

    
}
public class con {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.age + h.name);

        //  h.getAge();
        //  System.out.println(h.getAge());
      
        
        
    }
    
}
