public class Exception4 {
    public static void main(String []args)
    {
        try{
            System.out.println("Excecution  statement 1");
            System.out.println("Excecution  statement 2");
            System.out.println("Excecution  statement 3");
              try{
                  System.out.println("Excecution  statement 4");
                  System.out.println("Excecution  statement 5");
                  System.out.println("Excecution  statement 6");

                }
                  //System.out.println("Excecution  statement 3");
              catch(ArrayIndexOutOfBoundsException e)
                   {
                      System.out.println("Excecution  statement 7");
                   }
              finally{
                      System.out.println("Excecution  statement 8");
                     }
              System.out.println("Excecution  statement 9");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
             System.out.println("Excecution  statement 10");
        }
         // System.out.println("Excecution  statement 3");
        catch(Exception e)
        {
             System.out.println("Excecution  statement 10");
             try{
                  System.out.println("Excecution  statement 4");
                  System.out.println("Excecution  statement 5");
                  System.out.println("Excecution  statement 6");

                }
             catch(ArrayIndexOutOfBoundsException y)
                                                   {
                                                System.out.println("Excecution  statement 10");
                                                    }
        }
          // System.out.println("Excecution  statement 3");
        finally
        {
             System.out.println("Excecution  statement 11");
              
              try{
                  System.out.println("Excecution  statement 4");
                  System.out.println("Excecution  statement 5");
                  System.out.println("Excecution  statement 6");

                }
                  //System.out.println("Excecution  statement 3");
              catch(ArrayIndexOutOfBoundsException e)
                   {
                      System.out.println("Excecution  statement 7");
                   }
              finally{
                      System.out.println("Excecution  statement 8");
                     }
                    }
        // finally
        // {
        //      System.out.println("Excecution  statement 11");
        // }
        System.out.println(10/0);
    }
    
    
}

