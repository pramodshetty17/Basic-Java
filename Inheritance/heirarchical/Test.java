public class Test {
    public static void main(String[] args) {
        
        car c=new car();
        System.out.println("Brand:"+c.brand+" Cost:"+c.cost);
        c.start();


        bike b=new bike();
        System.out.println("Brand:"+b.brand+" Fuel:"+b.fuel);
        b.stop();
    }
}
