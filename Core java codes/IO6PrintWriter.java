import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO6PrintWriter {
    public static void main(String []args) throws IOException
    {
        File dir=new File("JAVA");
        dir.mkdir();
        File file=new File(dir,"pwskill.txt");

        FileWriter fr=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fr);

        pw.write(97);
        pw.write("\n");

        pw.println("java");
        pw.print(100);
        pw.println('a');
        pw.println(50.5);
        pw.print(true);
        
        pw.close();
    }
}
