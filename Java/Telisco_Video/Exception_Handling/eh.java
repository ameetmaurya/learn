package Exception_Handling;

public class eh {

    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try 
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limit ");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong"+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}