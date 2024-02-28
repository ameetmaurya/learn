package Exception_Handling;

public class throw_exception {
  

        public static void main(String[] args) {
            
            int i = 0;
            int j = 0;
    
          
    
            try  
            {
                j = 18/i;
                if(j==0)
                throw new ArithmeticException();
                
    
            }catch(ArithmeticException e)
            {
                // System.out.println("cannot divide by zero");
                j = 18/1;
                System.out.println("that the default uotpit");
    
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("stay in your limit ");
            }
            catch(Exception e)
            {
                System.out.println("something went wrong");
            }
    
            System.out.println(j);
            System.out.println("Bye");
        }
    }

