import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    // String Country();
    // int age();
    String country() default "India";
    int age() default 2;
}

@CricketPlayer//(Country = "India", age = 12)
class Virat
{   
    @CricketPlayer//(Country = "usa", age = 0)
    private int innings;
    private int runs;

    @CricketPlayer//(Country = "nepal", age = 0)
    public int getInnings(){
        return innings;
    }

    public void setInnings(int innings){
        this.innings=innings;
    }

    public int getRuns(){
        return runs;
    }

    public void setRuns(int runs){
        this.runs=runs;
    }

}


public class APT9Annotation {
    public static void main(String []args)
    {
        Virat v=new Virat();
        v.setInnings(300);
        v.setRuns(20000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c=v.getClass();
        Annotation a=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp=(CricketPlayer)a;

        String country=cp.country();
        System.out.println(country);
        int age=cp.age();
        System.out.println(age);

    }
}
