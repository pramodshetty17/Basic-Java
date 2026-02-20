public class Test {
    {
        System.err.println("Block-1");
    }
     {
        System.err.println("Block-2");
    }

    public static void main(String[] args) {
        System.out.println("Hello"); 
        Test t=new Test();
        System.out.println("Hello");
    }
     {
        System.err.println("Block-3");
    }
}
