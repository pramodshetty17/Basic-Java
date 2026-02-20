public class LargestOfThreeNum {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        int c=130;

        // if(a>b && a>c)
        // {
        //     System.out.println(a+" is Greater");
        // }
        // else if(b>a && b>c)
        // {
        //      System.out.println(b+" is Greater");
        // }
        //  else
        // {
        //      System.out.println(c+" is Greater");
        // }

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is largest");
            }
            else
            {
                System.out.println("c is largest");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
            System.out.println("b is largest");
            }
            else
            {
                System.out.println("c is largest");
            }
        }

    }
}
