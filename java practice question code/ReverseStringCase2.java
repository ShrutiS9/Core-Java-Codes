 class ReverseStringCase2 {
    public static void main(String []args){
        String str1="shruti Sawant";
        String str2="";
        String Sarr[]=str1.split(" ");
        for(int i=Sarr.length-1;i>=0;i--){
            str2=str2+Sarr[i]+" ";
        }
        System.out.println("Before Reversing: " + str1);
        System.out.println("After Reversing: " +str2);


    }

    }

