import java.util.ArrayList;

class Student2{

    private String name;
    private int id;

    public Student2(){

    }
}

class Employee2{
    private String name;
    private int id;

}



public class generic2 {
    public static void main(String []args)
    {
        Student2 stu1=new Student2();
        Student2 stu2=new Student2();

        Employee2 empid=new Employee2();

        ArrayList<Student2> al=new ArrayList<Student2>();
        al.add(stu1);
        al.add(stu2);
        //al.add(empid);

    }
}
