class emp{
    int eid;
    int salary;
    static String ceo;
    static{
        ceo="larry";
        System.out.println("in static");
    }

    public void show(){
        System.out.println(eid+":"+salary+":"+ceo);
    }

}
public class statickeyword {
    public static void main(String []a){
        emp navin=new emp();
        navin.eid=2;
        navin.salary=4000;
        emp.ceo="Mahesh";

        emp rahul=new emp();
        rahul.eid=3;
        rahul.salary=5000;
        emp.ceo="mahesh";

        emp.ceo="ankita"; 

        navin.show();
        rahul.show();
    }
}
