public class Test4 {
   
        public void m1(int i,float f){
        System.out.println("int, float arg method");
        }
        public void m1(float f, int i){
        System.out.println("float,int arg method");
        }
        public static void main(String[] args) {
        Test4 t = new Test4();
        t.m1(10,10.5f);//int,float arg method
        t.m1(10.5f,10);//float,int arg method
        //t.m1(10,10);//CE
        //t.m1(10.5f,10.5f);//CE
       
        }
    
}
