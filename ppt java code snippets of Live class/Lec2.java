/*data type , variable */

public class Lec2 {
    public static void main(String[] args) {

      //int a;
      //int b = a+10;   variable not initialize

        boolean a=true;
        boolean b=false; //   compile time error
      //   System.out.println(a+b);
       // System.out.println("*******************Snippets************************");

          //  byte a=10,b=20;
         //    byte b=20;
         // byte c=a+b;  compile error

        //System.out.println("*******************************************");

      //   int c=10;
      //   int d=20;
      //   int e=c+d;

        //System.out.println("*******************************************");


        //args[1]="Day!";
        //System.out.println(args[0]+" "+args[1]); //jvm will create the run time problem

        // System.out.println("*******************************************");

        //  byte b1=(byte) (127+21);
        //   System.out.println(b1);

           //System.out.println("*******************************************");

           //byte []p=new byte[0];
         //System.out.println(p[0]);// ArrayIndexOutOf 

             //System.out.println("*******************************************");
             //System.out.println("");

            //  java.lang.String msg="hello";
            // boolean flag[]=new boolean[1];
            //  if(flag[0]){
            //    msg="welcome";
            // }
            //   System.out.println(msg);

             //System.out.println("*******************************************");
                String msg1="hello";
             boolean flag1[]=new boolean[1];//flag[0]=null
             if(flag1[0]){
                msg1="welcome";
            }
             System.out.println(msg1);
            
    }
}
