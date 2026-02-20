public class Test {
    
    int display()
    {
        return 101;
    }
    public static void main(String[] args) {
        
        Test t=new Test();

        System.out.println(t.display());

        int result=t.display();
        System.out.println(result);
    }
}
