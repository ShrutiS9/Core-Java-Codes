public class Pangram {
    public static void main(String []args){
        boolean flag=false;
        String str1="THE QUICK ROWN FOX JUMPS OVER LAZY DOG AND BITTEN IT";

        str1=str1.replace(" ","");

        char arr1[]=str1.toCharArray();

        int arr2[]=new int[26];

        for(int i=0;i<arr1.length;i++){
            arr2[arr1[i]-65]++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==0){
                System.out.println("it's not a pangarm");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("it is a panagram");
        }
    }
}
