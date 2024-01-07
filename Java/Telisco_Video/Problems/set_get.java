package Problems;



class Student{

    private int RollNo;
    private String Name;
    private int Attendence;

    public int getRollNo()
    {
        return RollNo;
    }
    public void setRollNo(int r)
    {
       RollNo = r;
    }
    public String getName()
    {
        return Name;
    }

    public void setName(String n)
    {
        Name = n;
    }

    public int  getAttendence()
    {
        return Attendence;
    }

    public void setAttendence(int a)
    {
         Attendence = a;
    }
    
}



public class set_get {

 public static void main(String[] args) {
     
    Student stu1 = new Student();
    System.out.println("Student Info");
    stu1.setName("Ameet");
    stu1.setRollNo(19);
    stu1.setAttendence(95);
   
     Student stu2 = new Student();
     stu2.setName("Sachin");
    stu2.setRollNo(11);
    stu2.setAttendence(75);

    
   // System.out.println("Name"+":"+stu1.getName() + ":"  + "RollNo"+ ":"+stu1.getRollNo()+ ":"+ "Attendence" + ":"+stu1.getAttendence());
  System.out.println("Name"+":" +stu1.getName());
  System.out.println("RollNo"+":" +stu1.getRollNo());
  System.out.println("Attendence"+":" +stu1.getAttendence());

       System.out.println();
       
    System.out.println("Name"+":" +stu2.getName());
  System.out.println("RollNo"+":" +stu2.getRollNo());
  System.out.println("Attendence"+":" +stu2.getAttendence());
 }
}

