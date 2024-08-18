public class API1 {
    public static void main(String []args){
        
        java.util.Date d=new java.util.Date();
        System.out.println(d);

        long timeInMs=d.getTime();

        java.sql.Date dt=new java.sql.Date(timeInMs);
        System.out.println(dt);



        //java.util.ArrayList al=new java.util.ArrayList();
    }
}
