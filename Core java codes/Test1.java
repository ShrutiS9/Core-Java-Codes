public class Test1 {
    
        public void m1(String s){
        System.out.println("String arg method");
        }
        public void m1(Object d){
        System.out.println("Object arg method");
        }
        public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1("sachin");//String arg method
        t.m1(new Object());//Object arg method
        t.m1(null);//String arg method
        
        }
}

