package linkedlist;
import java.util.*;
import linkedlist.*;

public class linklist {
      public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();

        List.add("helllo");
        List.add("world");
        List.add("hii");
        List.add("bro");

        System.out.println("linkedlist:"+List);

        List.remove(2);
        System.out.println("Final linkedlist:"+List);
        
      }

}
