

public class markValidation {
    public static void main(String[] args) {
        int marks=-10;

        if(marks<=100 && marks>=85)
        {
            System.out.println("Distinction");
        }
        else if(marks<=84 && marks>=70)
        {
             System.out.println("First Class");
        }
        else if(marks<=69 && marks>=35)
        {
             System.out.println("Second Class");
        }
        else if(marks<=34 && marks>=0)
        {
             System.out.println(" Fail");
        }
        else
        {
            System.out.println("Invalid Marks");
        }
    }
}
