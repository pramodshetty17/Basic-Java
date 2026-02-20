

public class Addition {
    void Addition(int a,int b)
    {
        System.out.println(a+b);
        int result=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+result);
    }
    public static void main(String[] args) {
        Addition a=new Addition();

        a.Addition(10, 29);
        a.Addition(19, 29);
    }
}
