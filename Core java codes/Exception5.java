import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception5 {
    public static void main(String []args){
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader("abc.txt"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try{
                if(br!=null){
                    br.close();
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    
}
