public class localandGlobal {
    
    double height=5.5;

    void display()
    {
        double height=4.4;

        System.out.println("height:-"+height);
         System.out.println("height:-"+this.height);
    }
    public static void main(String[] args) {
        
        localandGlobal lg=new localandGlobal();

        lg.display();
    }
}
