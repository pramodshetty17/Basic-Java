public class student {
    public static void main(String[] args) {
        
        dept d=new dept();

      System.out.println("University Name:"+d.Universityname);
      System.out.println("College Name:"+d.collegename);

      System.out.println("Dept Name:"+d.deptName);


      System.out.println("--------------------------------");

      d.conductExam();
      d.conductSports();
      d.conductFest();
       
      


    }
}
