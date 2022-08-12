/*
Write a java program to accept file name from user and create new file of that name if it is not existing.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Create
{
    public void CreateFile(String FileName)
    {
        try
        {
            File fobj = new File(FileName);

            if(fobj.createNewFile() == true)
            {
                System.out.println("File Created : "+fobj.getName());
            }
            else
            {
                System.out.println("File already exist");
            }
        }
        catch(IOException obj)
        {
            System.out.println(obj);
        }
    }
}


class Create_File
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String str = sobj.nextLine();

        Create cobj = new Create();
        cobj.CreateFile(str);
    }

}