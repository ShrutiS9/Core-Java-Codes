import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class IO3Reader {
    public static void main(String []args) throws IOException
    {
        File dir=new File("PWJAVA");
        File file=new File(dir,"pw.txt");

        FileReader fr=new FileReader(file);

        // char ch[]=new char[(int)file.length()];
        // fr.read(ch);
        // for(char data:ch)
        // {
        //     System.out.print(data);
        // }
        System.out.println("**********************************");
        int i=fr.read();
        System.out.println("before going into loop   "+i);
        while(i!=-1)
        {
            System.out.print(i+"------->");
            System.out.println((char)i);
            i=fr.read();
            System.out.println("inside the loop   "+i);
        }
    }
}
