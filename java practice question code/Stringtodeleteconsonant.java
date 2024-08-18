public class Stringtodeleteconsonant {
    public static void main(String []args){
        int j=0;
        String s1="Hello,have a good day";
        char ch[]=new char[20];
      
        
        for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)=='a' ||s1.charAt(i)=='A' || s1.charAt(i)=='e' || s1.charAt(i)=='E' || s1.charAt(i)=='i'|| s1.charAt(i)=='I'|| s1.charAt(i)=='o'|| s1.charAt(i)=='O'|| s1.charAt(i)=='u'|| s1.charAt(i)=='U')
        {  
            ch[j++]=s1.charAt(i);
            System.out.println("value at j"+(j-1)+" "+ch[j-1]);
            System.out.println("string at index"+i+ " " +s1.charAt(i));
            
        } else{
           
            continue;
            
        }      
       for(int k=0;k<j;k++){
        System.out.println("index value of"+(j-1));
        System.out.print(ch[k]);

       }
       System.out.println();
     
    }
    }
    
}
