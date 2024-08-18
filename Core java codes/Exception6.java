import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception6 {
    public static void main(String []args){
        int result=7/0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String str=br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    
}
}
