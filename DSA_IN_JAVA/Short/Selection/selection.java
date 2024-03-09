package Short.Selection;

public class selection
{
   
 public static void main(String[] args) 
 {
    int min;
    int temp =0;
    int arr [] = { 38,52,9,18,6,62,13};
    
    

    for(int i =0;i<arr.length;i++)
    {
        min = i;
        for(int j = i+1;j<arr.length;j++)
        {
            if (arr[j]<arr[min])
            {
                min = j; // storeing index value in min if j is smaller than i
            }
        }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        
    
    }
      for(int i =0;i<arr.length;i++)
      {
           System.out.println(arr[i]);
      }
 }
}