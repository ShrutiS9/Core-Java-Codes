public class Anonymous {
    public static void main(String []args){
            calc obj=new calc();
            int result =obj.add(new int[]{4,56,78,78});
            System.out.print(result);
    }
}
 class calc{
    public int add(int num[]){
        int result=0;
        for(int n:num){
            result=result+n;
        }
    
        return result;

    }
}