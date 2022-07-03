import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exception_handelling_04 {
    public static void main(String[] args) throws Exception
    {
        // now we want to create our own error ....we want forcefully to call an error..wehn our requirements will not mett
        int sum,x,y;
        x = 8;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            y = Integer.parseInt(br.readLine());
            sum = x + y;
            if (sum<10)
            {
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("outpur must be grater than 10");
        }
    }
}
