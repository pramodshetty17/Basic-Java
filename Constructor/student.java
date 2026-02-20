public class student {
    int age;

    student(int a) {
        age=a;
    }

    public static void main(String[] args) {
        
        student s1=new student(23);
        student s2=new student(25);

        System.out.println("Age:-"+s1.age+"\nAge:-"+s2.age);

    }

    
}
