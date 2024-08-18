public class StringmutableBuffer {
    
    public static void main(String []args){
        StringBuilder sb1 =new StringBuilder("sachin");
        sb1.append("kohli");
        System.out.println(sb1);

        StringBuffer sb2 =new StringBuffer("sachin");
        sb2.append("kohli");
        System.out.println(sb2);

        final int a=10;
        //int a=20;
        System.out.println(a);

        final  StringBuffer sb3=new StringBuffer("Virat");
        sb3.append("kohli");
        System.out.println(sb3);
        //sb=new StringBuffer("Sachin");
        //System.out.println(sb);

        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity());//how many character you can add
        System.out.println(sb.length());//how mancy character r 

        StringBuilder sb4=new StringBuilder(150);
        System.out.println(sb4.capacity());
        sb4.append("java");
        System.out.println(sb4);
        sb4.trimToSize();
        System.out.println(sb4.capacity());

        StringBuffer sb5=new StringBuffer("Sachin");
        System.out.println(sb5);
        System.out.println(sb5.capacity());
        System.out.println(sb5.charAt(1));
       sb5.setCharAt(1, 'A'); //SAachin or SAchin
       System.out.println(sb5);

       
       StringBuilder sb6 = new StringBuilder("sachinrameshtendulkar");

       System.out.println(sb6.length());//21
       
       System.out.println(sb6.capacity());//21 + 16 = 37
       
       System.out.println(sb6.charAt(20));//'r'
       
       //System.out.println(sb6.charAt(100));//StringIndexOutOfBoundsException
       StringBuilder sb7 = new StringBuilder("sachin");

        sb7.setCharAt(2, 'C');

        System.out.println(sb7);
        StringBuffer sb8 = new StringBuffer();

sb8.append("PI value is :: ");
System.out.println(sb8);

sb8.append(3.1414);
System.out.println(sb8);

sb8.append(" This is exactly ");
System.out.println(sb8);
sb8.append(true);

System.out.println(sb8);

StringBuffer sb9 = new StringBuffer("sacin");

sb9.insert(3, 'h');

System.out.println(sb9);//sachin

sb9.insert(6, "IND");

System.out.println(sb9);//sachinIND
sb9.insert(9,1);
System.out.println(sb9);
sb9.insert(10,4l);
System.out.println(sb9); 
sb9.delete(6,10);
System.out.println(sb9);
sb9.deleteCharAt(3);
System.out.println(sb9);
sb9.setLength(4);
System.out.println(sb9);

sb9.ensureCapacity(1000);
System.out.println(sb9);

StringBuffer sbq = new StringBuffer();

sbq.append("sachin").insert(6, "tendulkar").reverse().append("IND").

delete(0, 4).reverse();

System.out.println(sbq);

}
}
