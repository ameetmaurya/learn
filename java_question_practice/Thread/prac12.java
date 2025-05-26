package Thread;

class eventread extends Thread
{
    public void run()
    {
        System.out.println("print even no from 1 to 10");
        int count =0;
       
        for(int i=0;i<10;i+=2)
        {
            System.out.println(i+" ");
            count++;
            if(count%3==0)
            try{
                Thread.sleep(200);


            }
            catch(InterruptedException e)
            {
                System.out.println("even thread interrupted");
            }
        }
    }
}
public class prac12 {
    public static void main(String[] args) {
        
    
    eventread even =new eventread();
    even.start();
}
}
