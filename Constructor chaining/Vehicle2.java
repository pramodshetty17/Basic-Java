public class Vehicle2 extends Vehicle1{

    Vehicle2(int x) {
        this();
        System.out.println(3);
    }

    Vehicle2()
    {
        super(10);
        System.out.println(4);
    }

    public static void main(String[] args) {
        
        Vehicle2 v=new Vehicle2(10);
    }
    
}
