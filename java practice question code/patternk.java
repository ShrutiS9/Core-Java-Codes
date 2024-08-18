public class patternk {
    public static void main(String []args){
        int n=20;
        int i,j,k,count=n/2;
        for(i=0;i<n;i++){
            for(j=0;j<2;j++){
                System.out.print("*");
            }
            for(k=0;k<=n/2;k++){
                if(k==count){
                    System.out.print("***");
                }else{
                    System.out.print(" ");
                }
            }
            if(i<n/2){
                count--;
            }else if(i<n){
                count++;

            }System.out.println("");
        }
        
        
    }
    
}
