public class platenumber{
    public static void main(String []args){
        StringBuffer str=new StringBuffer();
        for(int i=0;i<3;i++){
            char ch=(char)(Math.random()*26+'A');
            str.append(ch);
        }
        for(int j=0;j<4;j++){
            char digit=(char)(Math.random()*10+'0');
            str.append(digit);

        }System.out.println(str);
    }
}