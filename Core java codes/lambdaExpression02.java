interface lunch
{

    int  bread(int i,int j);
}

// class dinner{

// }


public class lambdaExpression02  {
    public void toast()
    {
        lambdaExpression02 t1=new lambdaExpression02();
       //System.out.println( lunch.bread(4,5));
    }
    public static void main(String []args)
    {
        lunch l=(i,j)->{
            System.out.println(i+j);
            return 1;
    };
    l.bread(4,5);
    }
}
