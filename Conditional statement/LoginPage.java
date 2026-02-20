public class LoginPage {
    public static void main(String[] args) {
        String id="pramod";
        int password=123;

        if(id=="pramodshetty")
        {
            if(password==13)
            {
                System.out.println("Password is Correct Login Successful");
            }
            else
            {
                System.out.println("Password is not correct Login is not Sucessfull");
            }
        }
        else
        {
            System.out.println("Id is Not Correct");
            System.out.println("Login is unsucessfull");
        }
    }
}
