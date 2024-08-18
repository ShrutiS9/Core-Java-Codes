 class TypeCasting {
    public static void main(String []args) {
        int a=22;
        double b;
        b=a;    //implicit typecasting
        System.out.println(b);
        
        double num1=45.5;
        int num2;
        num2=(int)num1; //explicit typecasting
        System.out.println(num2);
        
        int x=4;
        int y=3;
        float result=x/y;
        System.out.println(result);

        long t=5472l;
        float z;
        z=t;
        System.out.println(z);
    }
    
}
