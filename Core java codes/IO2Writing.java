
import java.io.FileWriter;//to transfer the data from java file to other file
import java.io.IOException;
import java.io.File;  
public class IO2Writing {
    public static void main(String []args) throws IOException
    {
        // File dir=new File("PWJAVA");
        // dir.mkdir();
        // File file=new File(dir,"pw.txt");
        // file.createNewFile();

        // FileWriter fw=new FileWriter(file,true);
         FileWriter fw=new FileWriter("javaprogram",true);
        


        fw.write("\n");
        fw.write("pw");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[]={'j','a','v','a'};
        fw.write(ch);

        //fw.close();
        fw.flush();
        System.out.println("open pw.txt to see result");

        
    }
}
