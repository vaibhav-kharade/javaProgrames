
import java.util.*;

class idpassword
{
    public static void main(String aa[])
    {
        Scanner sobj =new Scanner(System.in);

        String strname= "vaibhav";
        String strpass="vaibhav123";
        System.out.println("enter the name");
        String strsname= sobj.nextLine();
        System.out.println("enter your password");
        String strspass=sobj.nextLine();

        if((strname.equals(strsname))&&(strpass.equals(strspass)))
        {
            System.out.println("welcome to Q spider");
        }
        else
        {
            System.out.println("your ID PASSaWORD IS INCORRECT");
        }
    }
}