public class demo {
    
    demo(int a)
    {
      System.out.println("Heloo");
    }
    demo()
    {
        this(10);
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        demo d=new demo();

        System.out.println("End");

    }
}
