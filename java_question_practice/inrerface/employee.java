package inrerface;

interface salary  {
double basic_sal=30000;
void basic_sal();
}
 class Inneremployee {

    String name;
    int age;

    Inneremployee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display(){

        System.out.println("name:"+name);
        System.out.println("age:"+age);

    }
}

 class Gross_sal extends Inneremployee implements salary {
double ta,da,hra;

Gross_sal(String name,int age)
{
super(name,age);
}

public void basic_sal()
{
    System.out.println("basicm sal:"+ basic_sal);

}

void total_sal()
{
    ta=0.1*basic_sal;
    da=0.2*basic_sal;
    hra=0.3*basic_sal;
    double gross =basic_sal+ta+da+hra;
    System.out.println("Gross sal:" + gross);

}
}

  

public class employee {
    public static void main(String[] args) {
        
    
    Gross_sal g=new Gross_sal("ameet", 19);
    g.display();
    g.basic_sal();
g.total_sal();
    }
}
