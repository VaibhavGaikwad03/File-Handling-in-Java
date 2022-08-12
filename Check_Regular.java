/*
Write a java program to accept file name from user and check whether that file is regular or not.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class CheckFile
{
    public void Check_Regular(String FileName)
    {
        File fobj = new File(FileName);

        if(fobj.isFile() == true)
        {
            System.out.println("The file is regular...");
        }
        else
        {
            System.out.println("File does not exist or it is not regular");
        }
    }
}


class Check_Regular
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String str = sobj.nextLine();

        CheckFile cobj = new CheckFile();
        cobj.Check_Regular(str);
    }
}