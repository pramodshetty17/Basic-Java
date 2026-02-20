public class demo1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        main(20);
        main("Pramod");

    }
    public static void main(int x) {
        System.out.println("x:"+x);
    }

    public static void main(String y) {
        System.out.println("y:"+y);
    }
}

