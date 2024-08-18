import java.util.*;
class Student21
{
    int marks;
    int age;
    String name;
    public Student21( int marks, int age, String name)
    {
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

     
    
}

// class Alpha1 implements Comparator<Student21>
// {

   
//     public int compare(Student21 a, Student21 b) {
//         if(a.marks>b.marks)
//         {
//             return 1;
//         }
//         else{
//             return -1;
//         }
        
//     }

// }

public class Generics5Comparator {
    public static void main(String []args)
    {
         Student21 std1=new Student21(45, 18, "Rohan");
         Student21 std2=new Student21(50, 17, "Roshan");
         Student21 std3=new Student21(25, 22, "Ruhan");


       // Alpha1 a=new Alpha1();

//         Comparator<Student21> cm=new Comparator<Student21>(){
//              public int compare(Student21 a, Student21 b) {
//         if(a.marks>b.marks)
//         {
//             return 1;
//         }
//         else{
//             return -1;
//         }
        
//     }
// };
        

    //     Comparator<Student21> cm1=(Student21 a, Student21 b)-> {
    //     if(a.marks>b.marks)
    //     {
    //         return 1;
    //     }
    //     else{
    //         return -1;
    //     }
        
    // };
        


         List<Student21> list=new ArrayList<Student21>();
        list.add(std1);
        list.add(std2);
        list.add(std3);

        
        //Collections.sort(list,cm1);
        Collections.sort(list,
        (Student21 a, Student21 b)-> {
        if(a.marks>b.marks)
        {
            return 1;
        }
        else{
            return -1;
        }
        
    });
        System.out.println(list);



    }
}
