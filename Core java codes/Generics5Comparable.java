import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student212 implements Comparable<Student212>{
    int marks;
    int age;
    String name;
    public Student212( int marks, int age, String name){
        this.marks=marks;
        this.age=age;
        this.name=name;
    }
   
    public int getMarks() {
        return marks;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }

    public String toString(){
        return marks+" "+age+" "+name;

    }

     public int compareTo(Student212 std) {
        if(this.age>std.age)
        {
            return 1;
        }
        else{
            return -1;
        }
        
    }
    
}


public class Generics5Comparable {
    public static void main(final String []args)
    {
        Student212 std1=new Student212(45, 18, "Rohan");
        Student212 std2=new Student212(50, 17, "Roshan");
        Student212 std3=new Student212(25, 22, "Ruhan");


        
        List<Student212> list=new ArrayList<Student212>();
        list.add(std1);
        list.add(std2);
        list.add(std3);

        
        Collections.sort(list);
        System.out.println(list);



    }
}

