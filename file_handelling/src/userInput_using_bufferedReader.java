import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class userInput_using_bufferedReader {
    public static void main(String args[]) throws IOException    // this throws IOexception is used for checked exceptions we
            // can either use try catch or by this -> throws IOException

    {
        // but this take input in string formate theredore e use parse meatjod to convert this in to integer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());;

        System.out.println(n);
    }
}
