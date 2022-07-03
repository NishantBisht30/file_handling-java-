package com.company;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class reading_using_buffer {
    public static void main(String args[]) throws IOException
    {
        int ch;
        FileReader fw = new FileReader("C:\\Users\\asus\\IdeaProjects\\file_handelling\\newText.txt");
        BufferedReader bf= new BufferedReader(fw);
        while((ch = bf.read()) != -1)
        {
            System.out.print((char)ch);
        }
        bf.close();
    }
}
