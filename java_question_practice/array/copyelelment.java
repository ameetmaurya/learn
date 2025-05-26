package array;

import java.util.Scanner;

public class copyelelment {
   
    public static void main(String[] args) {
        
        System.out.println("Enter the no of element");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();

        int orginal[]=new int[num];
        int copy[]=new int[num];
      
        System.out.println("Enter "+num+"elemt");

        for(int i=0;i<num;i++)
        {
            orginal[i]=sc.nextInt();
        }

        for(int i=0;i<num;i++)
        {
            copy[i]=orginal[i];
        }

        System.out.println("Copied array");
        for(int i=0;i<num;i++)
        {
            System.out.println(copy[i]);
        }
    }
}
