public class Pen {

    static int cost=10;

    static 
    {
         cost=20;
    }
    public static void main(String[] args) {
        
        Pen p=new  Pen();
        System.out.println(cost);

    }

    {
        cost=30;

    }
}
