public class bike2 extends bike1 {
    void start()
    {
        super.start();
        System.out.println("Shetty");
    }
    public static void main(String[] args) {
        
        bike2 b=new bike2();
        b.start();
    }
}
