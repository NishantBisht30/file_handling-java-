package com.company;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
	    File f1 = new File("C:\\Users\\asus\\IdeaProjects\\file_handelling\\newText.txt");
        f1.createNewFile();
        System.out.println("Is exists : "+f1.exists());
        System.out.println("File Name : "+f1.getName());
        System.out.println("File length : "+f1.length());
        System.out.println("Can file read : "+f1.canWrite());

    }
}
