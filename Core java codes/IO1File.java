import java.io.File;
import java.io.IOException;
//import java.util.logging.Filter;

public class IO1File {
    public static void main(String []args)
    {
        //file
        File file1=new File("pwjava.txt");
        System.out.println("check file exist r not : "+file1.exists());

        //file create
        try{
        file1.createNewFile();   
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("file is refering to file pw : "+file1.exists());
        //file1.delete();
        //System.out.println(file1.exists());
       




        //folder or make folder
        File dir=new File("pw");
        //System.out.println(dir.exists());
        System.out.println("check is any directory exits or not : "+dir.isDirectory());

        //create directory
        dir.mkdir();     
        System.out.println("dir is refering to directory pw : "+dir.exists());



        //create file inside the created folder or directory
        File file=new File(dir,"pwskill.txt");
        
        System.out.println(file.isFile());
        try{
        file.createNewFile();
        }catch(IOException e)     
        {
            System.out.println(e.getMessage());
        }
        System.out.println("file is refering to pwskill.txt : "+file.isFile());


         System.out.println(file.length());

        

        //count the no of file in directory
        int count=0;
        File f=new File("pw");

        String str[]=f.list();

        for(String name:str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No of file are  : "+count);



    }
}
