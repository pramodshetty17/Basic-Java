import java.util.Scanner;

class demo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Value of a");
        int a=scan.nextInt();
        System.out.println("Enter Value of b");
        int b=scan.nextInt();
        System.out.println(a+b);
        scan.close();
    }
}