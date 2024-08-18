class Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2;
		
	}
	
}
public class Demo1 {
    public static void main(String[] agrs){
    
        Calc obj=new Calc();
        int result= obj.add(4,3);
        System.out.println( result);
        }
    }
