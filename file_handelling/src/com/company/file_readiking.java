package com.company;
import java.io.*;
public class file_readiking {
    public static void main(String args[]) throws IOException
    {
        int i;
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\asus\\IdeaProjects\\file_handelling\\newText.txt");
        do{
            i = fin.read();
            if(i != -1)
            {
                System.out.print((char)i);
            }
        }while(i != -1);

    }
}
