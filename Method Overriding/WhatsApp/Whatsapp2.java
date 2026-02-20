public class Whatsapp2 extends Whatsapp1 {
    
    void message()
    {
        super.message();
        System.out.println("Double tick supported");

    }

    void call()
    {
        System.out.println("Voice call supported");
    }
}
