public class student {
    static  int age;
    static 
    {
         age=10;
    }

    public static void main(String[] args) {
        
        System.out.println("Age:-"+age);
    }

    static 
    {
        age=20;
    }
}
