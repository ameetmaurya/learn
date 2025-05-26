package display_5_student;

import java.util.Scanner;

class Student{
    int id;
    String name;

    void setData(Scanner sc)
    {
        System.out.println("Enter the student id:");
        id =sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name:");
        name=sc.nextLine();
    }

    void display()
    {
        System.out.println("The student id is "+id+", and name is"+name);
    }

}
public class prac {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students=new Student[5];

        for(int i=0;i<5;i++){
            System.out.println("ENter the details of studenyt"+(i+1)+":");
            students[i]=new Student();
            students[i].setData(sc);

        }

        System.out.println("student details");
        for(int i=0;i<5;i++)
        {
            students[i].display();
        
    }
}
}

