package BasicPrograming;

import java.util.Scanner;

public class Amstrong {
    public static void main(String []args)
    {
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the second number ::");
      num2 = sc.nextInt();

      for (int i = num1; i<num2; i++){
         int check, rem, sum = 0;
          System.out.println("i="+i);
         check = i;
         while(check != 0)
        {
            rem = check % 10;
             System.out.println("rem: "+rem);
            sum = sum + (rem * rem * rem);
             System.out.println("sum : "+sum);
             System.out.println("check : "+check);
            check = check / 10;
            System.out.println("check : "+check);
             System.out.println("~~~~~~~~~~~~~~");
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
    }
}
