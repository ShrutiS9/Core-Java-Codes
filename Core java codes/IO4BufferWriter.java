import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;

public class IO4BufferWriter {
    public static void main(String []args) throws IOException
    {
        File dir=new File("pw");
        File file=new File(dir,"pwskill.txt");
        
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write(new char[]{'j','a','v','a'});
        
        bw.flush();
        bw.close();
        
    }
}
