package BasicPrograming;

public class Swapping {
    public static void main(String []args)
    {
        int a=12,b=9;
        int temp;
        System.out.println("Before swap a:"+a);
        System.out.println("Before swap b:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);


        int m=9,n=5;
        m = m - n;
        // Sum is stored in second variable
        n = m + n;
        // Difference of 1st from 2nd
        // is replaced in first variable
        m = n - m;
        // Print numbers
        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);

    }
}
