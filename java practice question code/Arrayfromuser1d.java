
import java.util.Scanner;
public class Arrayfromuser1d {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int num=sc.nextInt();
        int []ar=new int[num];

        for(int i=0;i<ar.length;i++){
            System.out.println("Please enter the marks of students");
            ar[i]=sc.nextInt();
        }
        
        System.out.println("The marks of the students are as follow");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    
}
    

