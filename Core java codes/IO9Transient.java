import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer_2 implements Serializable
{
    String name;
    transient int age;// not participate in serialization
    int runs;
    
    public Cricketer_2(String name,int age,int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);

    }
    
}


public class IO9Transient {
    public static void main(String []args) throws IOException, ClassNotFoundException{
        // Cricketer_2 c=new Cricketer_2("sachin", 44, 30000);

        // FileOutputStream fos=new FileOutputStream("pwskill.txt");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);

        // ObjectOutputStream oos=new ObjectOutputStream(bos);
        // oos.writeObject(c);
        // oos.flush();
        // oos.close();




        FileInputStream fis=new FileInputStream("pwskill.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer_2 cr=(Cricketer_2)ois.readObject();
        cr.disp();
        ois.close();


        
    }
    
}
