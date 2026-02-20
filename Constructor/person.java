public class person {
    
    int age;
    String name;

     person(int age,String name) {
        this.age=age;
        this.name=name;
    }

        public static void main(String[] args) {
        person p1=new person(23,"Pramod");
        person p2=new person(25,"Prasad");

        System.out.println("Name:-"+p1.name+"   Age:"+p1.age);
        System.out.println("Name:-"+p2.name+"   Age:"+p2.age);

    }

    
}
