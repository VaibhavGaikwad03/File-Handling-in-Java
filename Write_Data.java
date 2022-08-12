/*
Write a java program to accept file name from user and open that file and display the contents on screen.

*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Write
{
    public void Write_File(String FileName, String Data)
    {
        try
        {
            FileWriter fwobj = new FileWriter(FileName, true);
            BufferedWriter bwobj = new BufferedWriter(fwobj);

            bwobj.write(Data);
            bwobj.close();
            fwobj.close();

            System.out.println("Data written in File succesfully...");
        }
        catch(IOException obj)
        {
            System.out.println(obj);
        }
    }
}


class Write_Data
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the Data to write in File : ");
        String str2 = sobj.nextLine();

        Write wobj = new Write();
        wobj.Write_File(str1, str2);
    }

}