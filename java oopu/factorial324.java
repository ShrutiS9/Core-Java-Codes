class recursssion{
    public static int fact(int num){
        if(num==0){
            return 1;
        }else{
            return num *fact(num-1);
        }
 
    }


   
        public static void main(String []args){
            int n=4;
            int f=fact(n);
            System.out.println(f);
        }
    }
    
    

