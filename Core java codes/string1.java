public class string1 {
    public static void main(String[] args) {
        String s1=new String("sachin");
        String s2=new String("sachin");
        System.out.println(s1==s2);
        String s3="sachin";
        String s4="sachin";
        System.out.println(s3==s4);
        StringBuilder s=new StringBuilder("dhoni");
        System.out.println(s);
        s.append("bengaluru");
        System.out.println(s);  
        byte[] b={100,101,102};
System.out.println(b[2]);

String s8=new String(b);

System.out.println(s8);
char[] ch={'a','b','c'} ;

String s6=new String(ch);

System.out.println(s6);
    }
}
