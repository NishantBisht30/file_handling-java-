package com.company;
import java.io.*;
public class buffer_writter_class {
    public static void main(String args[]) throws IOException
    {
        FileWriter fw = new FileWriter("C:\\Users\\asus\\IdeaProjects\\file_handelling\\newText.txt",true);
        BufferedWriter bf= new BufferedWriter(fw);
        bf.write(" Computer");
        FileInputStream fr = new FileInputStream("C:\\Users\\asus\\IdeaProjects\\file_handelling\\newText.txt");
        int i;
        do {
            i = fr.read();
            if(i!=-1)
            {
                System.out.print((char)i);
            }
        }while(i!=-1);
        bf.close();
    }
}
