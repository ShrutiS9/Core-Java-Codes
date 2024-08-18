public class Exception1 {
    public static void main(String []args)
    {
        int num1=6;
        int num2=0;
        int result1=num1+num2;   //normal
        int result=num1/num2;   //critical
        System.out.println(result);
        System.out.println("bye");
    }
    
}
