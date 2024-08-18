import java.util.*;
public class Arrayfromuser2d {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int [][] ar=new int[3][];
        ar[0]=new int[3];
        ar[1]=new int[2];
        ar[2]=new int[4];

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println("please enter the marks of class" +i+"student"+j);
                ar[i][j]=sc.nextInt();
            }
        }
        for(int []a:ar){
            for(int b:a){
                System.out.print(b+" ");
            }System.out.println("");

        }


    }
    
}
