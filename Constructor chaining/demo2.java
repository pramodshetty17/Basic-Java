public class demo2 extends demo1{

    demo2()
    {
        super(10);
        System.out.println("Shetty");
    }

    demo2(int y)
    {
        this();
        System.out.println("Prasad");
    }

    public static void main(String[] args) {
        
        demo2 d2=new demo2(10);

    }
    
}
