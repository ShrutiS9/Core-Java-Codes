public class Ternaryoptrs {
    public static void main(String []args)
    {
        int a=10,b=20,c=40;
        int res=(a>b)?a:b;
        System.out.println(res);
        System.out.println((a<b)?"a is less":"b is less");
        int num=(a<b)?(a<c? a:b):(b<c? b:c);
        System.out.println(num);
    }
}
