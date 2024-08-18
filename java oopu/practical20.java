class odd implements Runnable{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==1){
                System.out.println(i +" "+"number is odd");
               
            }

        }
    }
}
class even implements Runnable{
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i + " "
                +"number is even ");
               
            }
        } 
    }
}
public class practical20 {
    public static void main(String []args){
        Runnable r=new odd();
        Thread t=new Thread(r);
        t.start();
        Runnable r1=new even();
        Thread t1=new Thread(r1);
        t1.start();

    }
}

