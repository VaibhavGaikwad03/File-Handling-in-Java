//Write a java program to accept directory name from user and display all names of files of directory which  are regular.

import java.lang.*;
import java.util.*;
import java.io.*;

class RegularFiles
{
    public void CheckRegular(String DirName)
    {
        File fobj1 = new File(DirName);

        String FileNames[] = fobj1.list();

        for(int i = 0; i < FileNames.length; i++)
        {
            File fobj2 = new File(DirName+"\\"+FileNames[i]);

            if(fobj2.isFile())
            {
                System.out.println(FileNames[i]);
            }
        }
    }
}

class Display_Regular_Files
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the directory name : ");
        String str = sobj.nextLine();

        RegularFiles robj = new RegularFiles();
        robj.CheckRegular(str);
    }
}