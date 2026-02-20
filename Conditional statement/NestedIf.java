public class NestedIf {
    public static void main(String[] args) {
        int a=61;

        if(a<=10)
        {
            System.out.println(a+" is passed the test go to next test");

            if(a==5)
            {
                System.out.println(a+" is equla to 5");
            }
            else
            {
                System.out.println(a+" is not equal 5");
            }
        }
        else
        {
            System.out.println(a+" is greater then 10");
        }
    }
}
