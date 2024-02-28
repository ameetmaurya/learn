package Short;

public class selection {

    public static void main(String[] args) {
        
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp;
        int minindex= -1;
    
        System.out.println("before Swaping");

        for(int num :nums)
        {
            System.out.print(num +" ");
        }


        for(int i =0;i<size-1;i++)
        {
            for (int j=i+1 ;j<size;j++)
            {
                  if(nums[minindex]>nums[j]);
                  minindex = j;


            temp = nums[minindex];
            nums[minindex]= nums[i];
            nums[i]= temp;
            }

        
    
        }
      
        System.out.println();
        System.out.println("After sorting");
      
        for(int num :nums)
        {
            System.out.print(num + " ");
        }
  
    }
    
}
