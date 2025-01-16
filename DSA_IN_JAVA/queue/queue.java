package queue;
import java.util.*;
public class queue {
static int inp_arr=10;
static int rear =-1;
static int front =-1;
static int[] queue =new int[inp_arr];

public void enqueue(int value)
{
    if(rear==inp_arr-1)
    System.out.println("\n overflow");
    
    else{
        if(front==-1)
            front =0;
            rear=rear+1;
              queue[rear]=value;
            
            
        }
 
    }
    



public int dequeue()
{
    if(rear==-1)
    {
        System.out.println("Underflow\n");
        return -1;

        
    }
    else{
            int dequeValue = queue[front];
            System.out.println("y age is:"+dequeValue);
            queue[front]=0;
            front++;
        return dequeValue;
    }
    
    
}


public void display()
{
if(front==-1 )
System.out.println("Empty queue\n");

else
{
    for(int i=front;i<=rear;i++)
    {
        System.out.println(queue[i]);

    }
}
    
}

public static void main(String[] args) {
    queue myqueue = new queue();
    // myqueue.enqueue(100);
    
    myqueue.enqueue(13);
    myqueue.enqueue(12);
    myqueue.enqueue(18);
myqueue.display();
   

    int poppedValue = myqueue.dequeue();
    if (poppedValue != -1) {
        System.out.println("Popped value: " + poppedValue);
    }
    
    myqueue.display();
    System.out.println("-----------------------------");
  for(int i=0;i<inp_arr;i++)
  {
    // if (i >= front && i <= rear)
    System.out.println(queue[i]);
  }
 
}
}
