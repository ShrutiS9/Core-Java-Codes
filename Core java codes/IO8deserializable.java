import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;


class Cricketer_1 implements Serializable
{
    private String name;
    private int age;

    
    private int runs;
    
    public Cricketer_1(String name,int age,int runs)
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

public class IO8deserializable {
    public static void main(String []args) throws Exception, ClassNotFoundException{
        //Cricketer_1 c=new Cricketer_1("sachin", 44, 30000);

        FileInputStream fis=new FileInputStream("pww.txt");
        BufferedInputStream bos=new BufferedInputStream(fis);

        ObjectInputStream ois=new ObjectInputStream(bos);
        Cricketer_1 cr=(Cricketer_1)ois.readObject();
        cr.disp();
        ois.close();


        
    }
    
}
