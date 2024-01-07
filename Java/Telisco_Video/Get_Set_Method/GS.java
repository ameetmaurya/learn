package Get_Set_Method;
 
class Human{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)

    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String m)
    {
        name = m;
    }
}

public class GS {

    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(23);
        obj.setName("ameet");

        System.out.println(obj.getAge() +" :" +" "+ obj.getName());
        
    }
    
}
