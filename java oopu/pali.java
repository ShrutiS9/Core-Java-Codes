public class pali {
    public static void main(String []args){
        String st1="mam";
        String st2="";
        for(int i=st1.length()-1;i>=0;i--){
            st2=st2+st1.charAt(i);

        }
        System.out.println(st2);
        if(st1.equals(st2)){
            System.out.println("pali");
        }else{
            System.out.println("not");
        }
    }
    
}
