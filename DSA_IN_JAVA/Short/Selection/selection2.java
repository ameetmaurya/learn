public class selection2{
    public static void main(String[] args) {
         
        int arr[]={12,2,14,5,3,1};
          int temp =0;
          int min;
        for(int i=0;i<arr.length;i++)
        {
            min =i;
            for(int j = i+1;j<arr.length;j++)
            {
               if(arr[min]>arr[j])
               {
                  min =j;
               }

              
            }
            temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
         
      for(int i =0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
}