 class Operators {
    public static void main(String []args){
        int a=30, b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(90%4);
        int x=5;
        int y=x++;
        System.out.println(x);
        System.out.println(y);
        int m=5;
        int n=++m;
        System.out.println(m);
        System.out.println(n);
        int d=9;
        int f=d++ + ++d + --d;
        System.out.println(d);
        System.out.println(f);
        int h=5;
        int g;
         g= h++ + ++h + ++h + h++ + --h + h--;
       System.out.println(h);
       System.out.println(g);
    }
    
}
