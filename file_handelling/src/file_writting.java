import java.io.*;

public class file_writting {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fout;
        fout = new FileOutputStream("C:\\Users\\asus\\IdeaProjects\\file_handelling\\newText.txt",true);
        String s = "TATA";
        char ch[] = s.toCharArray();
        for(int i=0;i<s.length();i++)
            fout.write(ch[i]);
        fout.close();
    }
}
