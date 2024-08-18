
class Stu_1{
    private String name;
    private int age;
    private String city;
    
    public Stu_1(String name,int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;

    }

    public String toString()
    {
        
        return "Name : "+name+ " | Age: "+age+" | city :"+city;
    }

}


public class IO1 {
    public static void main(String []args)
    {
        Stu_1 st1=new Stu_1("Virat",34,"Delhi");
        System.out.println(st1);

        Stu_1 st2=new Stu_1("Vikas",30,"Pune");
        System.out.println(st2);
    }
}
