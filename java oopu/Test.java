// class Loan{

//     public float getIR(){
    
//     return 7.0f;
    
//     }
    
//     }
    
//     class GoldLoan extends Loan{
    
//     public float getIR(){
    
//     return 10.5f;
    
//     }
    
//     }
    
//     class StudyLoan extends Loan{
    
//     public float getIR(){
    
//     return 12.0f;
    
//     }
    
//     }
    
//     class CraftLoan extends Loan{
    
//     }
    
//     class Test{
    
//     public static void main(String[] args){
    
//     Loan gold_Loan=new GoldLoan();
    
//     System.out.println("Gold Loan IR :"+gold_Loan.getIR()+"%");
    
    
//     Loan study_Loan=new StudyLoan();
    
//     System.out.println("Study Loan IR :"+study_Loan.getIR()+"%");
    
    
//     Loan craft_Loan=new CraftLoan();
    
//     System.out.println("Craft Loan IR :"+craft_Loan.getIR()+"%");
    
//     }
    
//     }
// class A{
//     private void m1(){
    
//     System.out.println("m1-A");
    
//     }
    
//     }
    
//     class B extends A{
    
//     void m1(){
    
//     System.out.println("m1-B");
    
//     }
    
//     }
    
    
//     public class Test{
    
//     public static void main(String args[]){
    
//     A a=new A();
    
//     a.m1();
//     }
// }
// 
// class A{

//     int m1(){
    
//     System.out.println("m1-A");
    
//     return 10;
    
//     }
    
//     }
    
//     class B extends A{
    
//     void m1(){
    
//     System.out.println("m1-B");
    
//     }
    
//     }
    
//     public class Test{
    
//     public static void main(String args[]){
    
//     A a=new B();
    
//     a.m1();
    
//     }
    
//     }
// class A{

//     void m1(){
    
//     System.out.println("m1-A");
    
//     }
    
//     }
    
//     class B extends A{
    
//     final void m1(){
    
//     System.out.println("m1-B");
    
//     }
    
//     }
    
//     public class Test{
    
//     public static void main(String[] args){
    
//     A a=new B();
    
//     a.m1();
    
//     }
// }    
class A{

    static void m1(){
    
    System.out.println("m1-A");
    
    }
    
    }
    
    class B extends A{
    
    static void m1(){
    
    System.out.println("m1-B");
    
    }
    
    }
    
    public class Test{
    
    public static void main(String args[]){
    
    B a=new B();
    
    a.m1();
    
    }
    
    }