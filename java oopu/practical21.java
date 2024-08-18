import java.io.FileInputStream;
import java.io.FileOutputStream;
public class practical21 {
    public static void main(String []args)
    {
        System.out.println("Data in file");
        try{
            FileOutputStream fout=new FileOutputStream("stdinfotxt");
            String str=("Name :Sachin Stream:CE,Sem:4th");
            byte b[]=str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Successfull write");

        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Retrive data from file");
        try{
            FileInputStream fin=new FileInputStream("stdinfotxt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
