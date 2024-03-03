package Short;

public class selection {

    public static void main(String[] args) {
   
        int arr[]= {2,5,3,4,1};


         
        int size = arr.length;
        int temp;
        int min;


        System.out.println("before Swafing");
        for(int num :arr)
        {
            System.out.print(num + " ");
        }


        for(int i =1;i<5;i++)
        {
            min = i;
            for(int j =i+1;j<5;j++)
            {
                if(arr[min]>arr[j])
                {
                   min = j;

                    
                }
               
                temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
               

            }
           
        }
         

        System.out.println("before Swafing");
        for(int num :arr)
        {
            System.out.print(num + " ");
        }

}
}
