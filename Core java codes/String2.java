public class String2 {
    public static void main(String []args){
        String s1="sachin";
        String s2="sachin";
        String s3=new String("sachin");
        String s4=new String("SACHIN");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4); 
        System.out.println(s2==s4);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s2.equalsIgnoreCase(s4));
    }
}
