
import java.util.Scanner;

public class EvenTest {
    public static void main(String[] args) {
        
        Even e=new Even();
        Scanner s=new Scanner(System.in);

        for(int i=1;i<=4;i++)
        {
            System.out.println("Enter a number");
            int n=s.nextInt();

            e.EvenorOdd(n);
        }
    }
}
