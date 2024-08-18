import java.util.*;
public class Farmersapp {
    public static void main(String []arrgs){
        farmer f1=new farmer();
        f1.input();
        f1.compute();
        f1.disp();
        farmer f2=new farmer();
        f2.input();
        f2.compute();
        f2.disp();


    }
      
}
class farmer{
    int a;
    float tr;
    float ri;
    float si;

    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter enter require amount:");
        a=scan.nextInt();
        System.out.println("enter time duration:");
        tr=scan.nextFloat();
        ri=8.5f;

    }
    void compute(){
        si=(a*tr*ri)/100f;

    }
    void disp(){
        System.out.println("Si :"+si);
    }
}