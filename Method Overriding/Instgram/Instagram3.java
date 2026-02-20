public class Instagram3 extends Instagram2{
    
    void upload()
    {
        super.upload();
        System.out.println("Video is  Supported");
    }

    void message()
    {
        super.message();
        System.out.println("Gif Image is Supported");
    }

    void story()
    {
        System.out.println("Image is Supported");
    }
}
