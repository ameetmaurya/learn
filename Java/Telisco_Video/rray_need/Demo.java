package rray_need;

public class Demo
{

    public static void main(String[] args)
     {
        // int num [] = {2,3,4};
        // num[1]= 5;
        // System.out.println(num[1]);
        
        int num[] = new int[3];
        num[0]=1;
        num[1]= 4;
        num[2]= 3;

           
        // for(int i = 0; i>= 2;i++){
        // System.out.println(num[i]);
        // }

        //Enhanced for loop
        for (int n :num)
        {
            System.out.println(n);
        }
    }
    
    
}
