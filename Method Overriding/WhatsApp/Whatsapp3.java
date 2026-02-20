public class Whatsapp3 extends Whatsapp2 {
    void message()
    {
        super.message();
        System.out.println("Blue Tick supported");
    }

    void call()
    {
        super.call();
        System.out.println("Video Call Supported");
    }
    void status()
    {
        System.out.println("Image only supported");
    }
}
