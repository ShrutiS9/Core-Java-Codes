import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IO5BufferedReader {
    public static void main(String []args) throws IOException
    {
         File dir=new File("pw");
        File file=new File(dir,"pwskill.txt");
        
        FileReader fw=new FileReader(file);
        BufferedReader br=new BufferedReader(fw);
        

        String line=br.readLine();
        

        while(line!=null){
            System.out.println(line);
            line=br.readLine();
            

        }

    }
}
