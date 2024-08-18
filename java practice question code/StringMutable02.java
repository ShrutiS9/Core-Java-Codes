public class StringMutable02  {
    public static void main(String []args){
        String str="Think Twice";
        String str1="";
        String []s=str.split(" ");
        for(String elem:s){
            
            for(int j=elem.length()-1;j>=0;j--){
                str1=str1+elem.charAt(j);
            
        }str1=str1+" ";
        
    
    }
    System.out.println(str1);
}
}
