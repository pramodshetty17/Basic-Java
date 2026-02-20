public class ObjectStudent {
    String name;
    int mark;

    public static void main(String[] args) {
        
        ObjectStudent s1=new ObjectStudent();
        ObjectStudent s2=new ObjectStudent();

        s1.name="Pramod Shetty";
        s1.mark=98;

        s2.name="Prasad";
        s2.mark=97;

        System.out.println(s1.name+" "+s1.mark);
        System.out.println(s2.name+" "+s2.mark);



    }
}
