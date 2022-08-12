/*
Write a java program to accept two file names from user and open first file and create new file(Second file) and copy the data from first file into newly created file.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Copy
{
    public void Copy_Data(String src, String dest)
    {
        try
        {
            File fobj = new File(dest);

            if(fobj.createNewFile() == true)
            {
                System.out.println("Destination file created succesfully : "+fobj.getName());
            }

            FileInputStream finobj = new FileInputStream(src);
            FileOutputStream foutobj = new FileOutputStream(dest);

            int i = 0;

            while((i = finobj.read()) != -1)
            {
                foutobj .write(i);
            }

            System.out.println("Copying finished...");
            finobj.close();
            foutobj.close();
        }
        catch(IOException obj)
        {
            System.out.println(obj);
        }
    }
}


class Copy_Data
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first file name : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second file name : ");
        String str2 = sobj.nextLine();

        Copy cobj = new Copy();
        cobj.Copy_Data(str1, str2);
    }
}