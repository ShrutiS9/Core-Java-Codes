public class String3 {
    public static void main(String []args){
        String s1="sachin";
        s1.concat("blr");
        System.out.println(s1);
        s1=s1.concat("banglore");
        System.out.println(s1);
        String s=new String("sachin");
        s.concat("blr");
        String s0=s.concat("blr");
        System.out.println(s0);

        String str1="hello";
        String str2="world";
        String str3=str1.concat(" ").concat(str2);
        System.out.println(str3);

        String d1="hello";
        String d2="world";                          //" +" operator
        String d3= d1+" "+d2;
        System.out.println(d3);

    }
}
