
enum Result {

    PASS, FAIL,NR;
    //public static final Result PASS=new result();
    //public static final Result FAIL=new result();
    //public static final Result NR=new result();
 
    int marks;

    Result()
    {
        System.out.println("Constructor in Enum");
    }

    void setMarks(int marks)
    {
        this.marks=marks;
    }

    int getMarks(){
        return marks;
    }
}


public class API6enum {
    public static void main(String []args)
    {
        Result.PASS.setMarks(50);

        int m1=Result.PASS.getMarks();

        System.out.println(m1);//50


        int m2=Result.FAIL.getMarks();
        System.out.println(m2);

        Result.NR.setMarks(45);
        int m3=Result.NR.getMarks();
        System.out.println(m3);//45

    }
}
