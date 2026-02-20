public class student {

     student(int age) {
        this("Pramod");
        System.out.println("Age:"+age);
    }

     student(double height) {
        this(23);
        System.out.println("Height:"+height);
    }

     student(String name) {
        
        System.out.println("Name:"+name);
    }
    
    public static void main(String[] args) {
        
        student s=new student(5.1);
        
    }
}
