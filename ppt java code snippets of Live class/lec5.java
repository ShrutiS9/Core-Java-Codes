public class lec5 {
    
    public static void main(String []args)
    {
        // int a[]=new int[2];
        // System.out.println(a);
        


        //int b[]=a;
        //System.out.println(b);
        String str="sj";
        Object ob[]=new Object[2];
        ob[0]=str;
        System.out.println(ob[0]);


        // Integer a =new Integer(10);
        // int[] b = new int[a.MAX_VALUE];
        // int[] c = new int[a.MAX_VALUE + 1];//RE: OutOfMemoryError[heapmemory is full]

        Object[] obj=new Object[5];
        obj[0] =new Object();//valid
        obj[1] =new Integer(10);//valid
        obj[2] =new String("sachin");//valid
        for(int i=0;i<5;i++)
        {
            System.out.println(obj[i]);
        }

        Runnable[] r=new Runnable[5];
        r[0]= new Thread("sachin");
         for(int i=0;i<5;i++)
        {
            System.out.println(r[i]);
        }
        //r[1]= new String("dhoni");//CE

        // int[] a ={10,20,30,40};
        // System.out.println(a);
        // System.out.println(a[0]);
        // System.out.println(a.length);

        System.out.println("Output is: " + (10 != 5));

        int[][] a = {{1,2,}, {3,4}};
         int[] b = (int[]) a[1];
         for(int v:b)
            {
                System.out.print(v);
            }
             System.out.println("");
             
         Object o1 = a;
         int[][] a2 = (int[][]) o1;
         for(int v[]:a2)
            {
                for(int x:v)
                System.out.print(x);
            }
             System.out.println("");
        System.out.println(b[1]);
    }
}
