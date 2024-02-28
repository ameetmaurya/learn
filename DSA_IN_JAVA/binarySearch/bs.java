package binarySearch;

public class bs {

    public static void main(String[] args) {
        
         // int num[] = {3,5,7,13,17};
        int num[]={20,1,5,3,2,4,21};
        int target = 21;

        int result = binarySearch(num ,target);

        if(result != -1)
        {
            System.out.println("Element found at index :"+result+ " "+num[result]);

        }else 
        {
            System.out.println("Element Not found");
        }

    }

    public static int binarySearch(int[] num, int target) {
        
        int left = 0;
        int right = num.length-1;
        System.out.println(right);
       

        while(left<=right)
        {
            int mid = (left+right)/2;

            if(num[mid]== target)
            {
                return mid;
            }
            else if(num[mid]<target){
                
                left = mid +1;
                   
            }
            else{
                right = mid -1;
            }
        }

      

    

        return -1;
       
    }
    
    
}
