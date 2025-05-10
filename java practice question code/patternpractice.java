public class patternpractice {
    public static void main(String []args){
        int n=5;
        for(int i=0;i<n;i++){  //for A
            
            for(int j=0;j<n;j++){
                if(j==0&&i>0 ||i==0 &&j>0&&j<(n-1)/2 ||j==(n-1)/2&& i>0||i==(n-1)/2&&j<=(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }System.out.print(" ");
            for(int j=0;j<n;j++){   // for B
                if(j==0||i==0&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2||i==(n-1)&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<(n-1)/2||j==(n-1)/2&&i>(n-1)/2&&i<(n-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){   //for C
                if(i==0&&j>0&&j<=(n-1)/2 ||i==(n-1)&&j>0&&j<=(n-1)/2 ||j==0&&i<(n-1)&&i>0&&j<(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for D
                if(j==0||i==0&&j<(n-1)/2||i==(n-1)&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){// for E
                if(j==0||i==0&&j<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2||i==(n-1)&&j<=(n-1)/2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for F
                if(j==0||i==0&&j>=0&&j<=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for G
                if(i==0&&j>0&&j<=(n-1)/2 ||i==(n-1)&&j>0&&j<=(n-1)/2 ||j==0&&i<(n-1)&&i>0&&j<(n-1)||j==(n-1)/2&&i>=(n-1)/2||i==(n-1)/2&&j>1&&j<=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for H
                if(j==0||i==(n-1)/2&&j<=(n-1)/2||j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(""); 
            for(int j=0;j<n;j++){  //for I
                if(i==0&&j<=(n-1)/2 ||i==(n-1)&&j<=(n-1)/2 ||j==(n-1)/4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){   //for J
                if(i==0&&j<=(n-1)/2 ||i==(n-1)&&j<(n-1)/4 ||j==(n-1)/4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){   //for K
                if(j==0 || i+j==(n-1)/2 ||i-j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for L
                if(i==(n-1)&&j<=(n-1)/2 ||j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for M 
                if(j==0 ||j==(n-1)/2 ||i==j&&j<=(n-1)/4 ||i+j==(n-3)/2&&j>(n-1)/4&&j<(n-1)/2&&i<=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){   //for N
                if(j==0 ||j==(n-1)/2 ||i/2==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for O
                if(j==(n-1)/4||j==((3*n)-3)/4 ||i==0&&j>=(n-1)/4&&j<=((3*n)-3)/4 ||i==(n-1)&&j>=(n-1)/4&&j<=((3*n)-3)/4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for p
                if(j==0||i==0&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2 ||j==(n-1)/2 && i>0 &&i<(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for Q
                if(j==(n-1)/4||j==((3*n)-3)/4 ||i==0&&j>=(n-1)/4&&j<=((3*n)-3)/4 ||i==(n-1)&&j>=(n-1)/4&&j<=((3*n)-3)/4 ||i==j&&j>(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print(" ");
            for(int j=0;j<n;j++){  //for R
                if(j==0||i==0&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2 ||j==(n-1)/2 && i>0 &&i<(n-1)/2 ||i-j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){ //for S
                if(i==0&&j<=(n-1)/2&&j>0||i==(n-1)/2&&j<=(n-1)/2&&j>0 ||i==(n-1)&&j<=(n-1)/2 ||j==0&&i>0&&i<(n-1)/2 ||j==(n-1)/2&&i>(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for T
                if(i==0&&j<=(n-1)/2||j==(n-1)/4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for U
                if(j==0&&i<(n-1) ||j==(n-1)/2&&i<(n-1) ||i==(n-1)&&j>0&&j<(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for V
                if(i/2==j ||i/2+j==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for W
                if(j==0 ||j==(n-1)/2|| i+j==(n-1)&&j<=(n-1)/4 ||i-j==(n-3)/2&&j>(n-1)/4&&j<(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for X
                if(i/2==j ||i/2+j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for y
                if(i/2==j &&i<=(n-1)/2||i/2+j==(n-1)/2&&i<=(n-1)/2||j==(n-1)/4&&i>=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("");
            for(int j=0;j<n;j++){  //for Z
                if(i/2+j==(n-1)/2 ||i==0&&j<=(n-1)/2 ||i==(n-1)&&j<=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
    }
}
