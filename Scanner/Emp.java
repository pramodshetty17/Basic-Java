import java.util.Scanner;

public class Emp {

    void add(int a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }
    public static void main(String[] args) {
        
        Emp e=new Emp();
        Scanner s=new Scanner(System.in);

        // System.out.println("Enter the name of employee");
        // String name=s.next();
        //  System.out.println("Enter the age of employee");
        // int age=s.nextInt();
        //  System.out.println("Enter the salary of employee");
        // double salary=s.nextDouble();

         
        // System.out.println("Age:"+age+" Name:"+name+" Salary:"+salary);

        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter the a value");
        int a=s.nextInt();
        System.out.println("Enter the b value");
        int b=s.nextInt();

        e.add(a,b);
        }



 

    }
}
