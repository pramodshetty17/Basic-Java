public class son extends father {
    int age=23;

    void display()
    {
        int age=22;
        System.out.println("Age:"+age);
         System.out.println("Age:"+this.age);
          System.out.println("Age:"+super.age);

    }
}
