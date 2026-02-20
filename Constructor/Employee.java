public class Employee {
    int id;
    String name;
    double salary;

     Employee(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void display()
    {
        System.out.println("Employee Id:"+this.id);
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee Salary:"+salary);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Employee e1=new Employee(101, "Pramod", 19100.12);
         Employee e2=new Employee(102, "Prasad", 50100.10);
        Employee e3=new Employee(103, "Pratham", 18000.92);
        
        e1.display();
        e2.display();
        e3.display();
        
    }

    
}
