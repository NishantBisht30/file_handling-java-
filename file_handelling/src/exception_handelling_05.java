import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exception_handelling_05 {
    public static void main(String[] args) throws Exception
    {
        // we want to create our own exception
        int i=5;
        try
        {

            if (i<10)
            {
                throw new myException("Errrror");
            }
        }
        catch(myException e)
        {
            System.out.println(e);
        }
    }
}
class myException extends Exception       // it will have all exception from in-built Exception class
{
    public myException(String msg)
    {
        super(msg);     // this will call constructor of Exception class
    }
}

