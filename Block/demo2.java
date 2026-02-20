public class demo2 {
    
    static void m1()
    {
       System.out.println("Hai");
       int result=m2();
       System.out.println("Bye "+result);

    }
    static int m2()
    {
        return 20;
       
    }
      static void   m3()
    {
         System.out.println("Hello");
    }
public static void main(String[] args) {
    
    System.out.println("Start");
    demo2 d=new demo2();
    m1();
    d.m3();
    System.out.println("End");
}
}
