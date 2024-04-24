package Short.Bubble;

public class bubble2 {
    public static void main(String[] args) {
        int arr[] = {12,14,11,10,9,15,14,1,6,7,4,3,2,55,66,33,24,67,89,67,77};
        int temp;
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if (arr[j]>arr[j+1]) 
                {

                    temp = arr[j];
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp;                    
                }
            }
      
        }

        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);     
        }
      
    }
    
}
