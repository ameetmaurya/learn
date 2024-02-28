package LinearSearch;

public class ls {

    public static void main(String[] args) {
        
        int num[] = {3,5,7,13,17};
        int target = 7;

        int result = linearSearch(num ,target);

        if(result != -1)
        {
            System.out.println("Element found at index :"+result);

        }else 
        {
            System.out.println("Element Not found");
        }

    }

    public static int linearSearch(int[] num, int target) {

        for(int i =0;i<num.length;i++)
        {
            if(num[i]==target)
            {
                return i;
            }
        }

        return -1;
       
    }
    
}
