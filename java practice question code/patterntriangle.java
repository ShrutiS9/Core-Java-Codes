public class patterntriangle {
    public static void main(String []args){
        int n=20;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j<=(n-1)/2 ||j==0&&i<=(n-1)/2 ||i+j<=(n-1)/2 ||j==(n-1)&&i<=(n-1)/2||i==0&&j>=(n-1)/2||j-i>=(n-1)/2||i==0||i==(n-1)/2){
                    System.out.print(" ");
                }else if(i>=(n-1)/2 ||i==(n-1)&& j==0|| j==(n-1)){
                    System.out.println(" ");
                }
                    else{
                    System.out.print("*");
                }
            }System.out.println("");
        }
    }
    
}
