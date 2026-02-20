public class Student1 {
    
    int id;
    static String college="Amc";

    public static void main(String[] args) {
        
        Student1 s1=new Student1();
        Student1 s2=new Student1();
        Student1 s3=new Student1();


        s1.id=101;
        s2.id=102;
        s3.id=103;
        System.out.println(s1.id+" "+college);
        System.out.println(s2.id+" "+college);
        System.out.println(s3.id+" "+college);
        
    }
}
