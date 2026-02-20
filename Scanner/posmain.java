import java.util.Scanner;

public class posmain {
    public static void main(String[] args) {
        
        pos p=new pos();
        Scanner s=new Scanner(System.in);

       for(int i=1;i<=5;i++)
       {
         System.out.println("Enter the number");
        int n=s.nextInt();

        p.pos(n);
       }
    }
}
