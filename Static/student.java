class student{
   static int age=10;

   static void study()
   {
    System.out.println("Student is studying");
   }

   public static void main(String[] args) {
       
     System.out.println(student.age);
     student.study();

     System.out.println("=========================");

     System.out.println(age);
     study();
   }

}