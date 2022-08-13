//Write a java program to accept directory name from user and display all names of files from that directory and size of each file on screen.

import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

class FileName_Sizes
{
    public void Display(String DirName)
    {
        File fobj = new File(DirName);

        String FileNames[] = fobj.list();

        long bytes = 0;

        for(String FileName : FileNames)
        {
            try
            {
                Path pobj = Paths.get(DirName+"\\"+FileName);
                bytes = Files.size(pobj);
                System.out.println(FileName+" : "+bytes+" bytes");
            }
            catch(IOException obj)
            {
                System.out.println(obj);
            }
        }
    }
}

class Display_Filenames_and_Sizes
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name : ");
        String str = sobj.nextLine();

        FileName_Sizes fsobj = new FileName_Sizes();
        fsobj.Display(str);
    }
}