/*
Write a java program to accept file name from user and open that file and display the contents on screen.

*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Display
{
    public void Display_Contents(String FileName)
    {
        try
        {
            FileReader fobj = new FileReader(FileName);

            int i = 0;

            while((i = fobj.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch(IOException obj)
        {
            System.out.println(obj);
        }
    }
}


class Display_File
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String str = sobj.nextLine();

        Display dobj = new Display();
        dobj.Display_Contents(str);
    }

}