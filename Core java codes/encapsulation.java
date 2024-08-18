// class student{
//     int age;
//     String name;

//     public void show(){
//         System.out.println(age+" "+name);
//     }
// }
// public class encapsulation {
//     public static void main(String []a){
//     student obj=new student();
//     obj.age=3;
//     obj.name="dharmesh";
//     obj.show();
// }
// }

// shadowing problem
// class student{
//     private int age;
//     private String name;

//     public void setdata1(int a){
//         age=a;
        
//     }

//     public void setdata2(){
        
//         name="dharmesh";
//     }

//     public void show(){
//         System.out.println(age+" "+name);
//     }
// }
// public class encapsulation {
//     public static void main(String []a){
//     student obj=new student();
//     student obj1=new student();
//     obj.setdata1(18);
//     obj1.setdata1(19);
//     obj.show();
//     obj1.show();
// }
// }

//shadowing problem
// class student{
//     private int age;
//     private String name;

//     public void setdata1(int age){
//         age=age;
        
//     }

//     public void setdata2(){
        
//         name="dharmesh";
//     }

//     public void show(){
//         System.out.println(age+" "+name);
//     }
// }
// public class encapsulation {
//     public static void main(String []a){
//     student obj=new student();
//     student obj1=new student();
//     obj.setdata1(18);
//     obj1.setdata1(19);
//     obj.show();
//     obj1.show();
// }
// }



class student{
        private int age;
        private String name;
    
        public void setAge(int age){
           this.age=age;
            
        }

        public int getAge(){
            return age;
             
         }
     
        public void setName(String name){
            
            this.name=name;
        }
        public String getName(){
            
            return name;
        }
    
    
        public void show(){
            System.out.println(age+" "+name);
        }
    }
    public class encapsulation {
        public static void main(String []a){
        student obj=new student();
        student obj1=new student();
        obj.setAge(18);
        obj1.setAge(19);
        obj.setName("arijit");
        obj1.setName("akash");
        int stud1Age=obj.getAge();
        String stud1Name=obj.getName();
        System.out.print(stud1Age+"  ");
        System.out.println(stud1Name);
    }
    }

