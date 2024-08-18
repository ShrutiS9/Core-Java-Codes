import java.io.*;
public class practical22{
    private static Object Character;

    public static void main(String []args)throws Exception{
        BufferedReader bufread=new BufferedReader(new FileReader(("new.txt")));
        BufferedWriter bufwrite=new BufferedWriter(new FileWriter(("new.txt")));
        int i;
        do{
            i=bufread.read();
            if(i!=-1){
                if(Character.isUpperCase((char)i)){
                    bufwrite.write(Character.toLowerCase((char)i));
                }
                else{
                    bufwrite.write((char)i);
                }
            }
        }while(i!=-1);
        bufread.close();
        bufwrite.close();

    }

    private static Object uppercase(char i) {
        return null;
    }
}