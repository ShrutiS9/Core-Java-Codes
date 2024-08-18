import java.io.Serializable;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;
    
    public Cricketer(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
    
}

public class IO7Serializable {
    public static void main(String []args) throws IOException
    {
        Cricketer c=new Cricketer("sachin", 44, 30000);
        File f=new File("pww.txt");
        f.createNewFile();

        FileOutputStream fos=new FileOutputStream(f);
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

    }
}
