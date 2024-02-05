package Enum_java;


enum status{
    running , falied , pending , success;
}


class switch_if_else_enum{
    public static void main(String[] args) {
        
        status s = status.falied;
          // done with if-else
    //     if(s==status.running)
    //     {
    //         System.out.println("all good");
    //     }else if(s==status.falied)
    //     {
    //         System.out.println("try again");
    //     }
    //     else if (s == status.pending)

    //     {
    //         System.out.println("not Completed");

    //     }else 
    //     {
    //         System.out.println("done");
    //     }

    // done with switch

    switch (s) {
        case running:
             System.out.println("all good");
            break;
        case falied:
        System.out.println("try again");
        break;

        case pending:
        System.out.println("not completed");
            break;
      
    
        default:
        System.out.println("done");
            break;
    }
    }

}