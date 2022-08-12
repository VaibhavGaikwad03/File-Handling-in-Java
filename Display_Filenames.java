/*
Write a java program to accept directory name from user and display all names of files from that directory.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Display
{
    public void DisplayFileNames(String DirName)
    {
        File fobj = new File(DirName);

        String FileNames[] = fobj.list();

        for(String FileName : FileNames)
        {
            System.out.println(FileName);
        }
    }
}


class Display_Filenames
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Directory name to display names of all files in it : ");
        String str = sobj.nextLine();

        Display dobj = new Display();
        dobj.DisplayFileNames(str);
    }

}