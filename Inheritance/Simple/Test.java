
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        positive p=new positive();
        Scanner s=new Scanner(System.in);

        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter the Number");
        int n=s.nextInt();
        p.n=n;
        p.even();
        p.pos();
        }

    }
}
