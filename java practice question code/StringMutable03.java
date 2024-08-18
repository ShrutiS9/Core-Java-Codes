import java.util.Arrays;
public class StringMutable03 {
    public static void main(String []args){
       String str="pwskills";
       char []ch=str.toCharArray();
       Arrays.sort(ch);
       for(int i=0;i<ch.length;i++){
       System.out.print(ch[i]+" ");
       }
    }
}
