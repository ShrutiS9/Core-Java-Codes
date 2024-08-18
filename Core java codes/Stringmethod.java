public class Stringmethod {
    public static void main(String []args){
        String s="sachin";
        String d="SACHIN";
        String c="              such  break ";
        String t="banana";
        System.out.println(s.charAt(0));
        System.out.println(s.concat("tendulkar"));
       // s+="IND";
        // System.out.print(s);
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 4));
        System.out.println(s.length());
        System.out.println(s.replace('n', 't'));
        System.out.println(s.toUpperCase());
        System.out.println(d.toLowerCase());
        System.out.println(c.trim());
        System.out.println(s.indexOf('s'));
        System.out.println(s.indexOf('t'));
        System.out.println(t.lastIndexOf('a'));
        String s1="sachin";

String s2=s1.toString();

System.out.print(s1==s2);
    }
}
