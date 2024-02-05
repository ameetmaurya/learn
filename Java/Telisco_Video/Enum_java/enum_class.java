package Enum_java;

//enum cannot be ectend

enum laptop{
    macbook(2000),xps(2200),surface(23000),thinkpad(1800);

    private laptop(int price) {
        this.price = price;
    }

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
public class enum_class
{
    public static void main(String[] args) {

        // laptop lap = laptop.macbook;
        // System.out.println(lap);
        
        for(laptop lap:laptop.values())
        {
   System.out.println(lap +":"+lap.getPrice());
        }
    }
}
