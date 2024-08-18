import java.util.Scanner;
class mtof
{
      public static void main(String []args)
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value in meter:");
         double meter=sc.nextDouble();
         double feet=meter*3.28;
         System.out.print(meter+ "meters " +feet+ "feets");
      }
}