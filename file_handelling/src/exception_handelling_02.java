
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exception_handelling_02
{

    public static void main(String args[]) throws Exception
    {
//        BufferedReader br = null;
//        // taking input from user using buffer reader
//        try {
//            String str = "";
//            br = new BufferedReader(new InputStreamReader(System.in));
//            str = br.readLine();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        finally
//        {
//            // now if you only want to close br then instead of doing this way ... you can do it in the way specified below
//            br.close();
//        }


        // this is the way in which try taking input resources and as soon as the try's work  completed
        // it will directly close the br ....we don't have to write br.close
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = "";

            str = br.readLine();
        }
    }

}



