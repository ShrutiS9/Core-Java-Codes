/*class Test
{
int i =10;
public static void main(String[] args) {
//System.out.println(i);//CE: non static variable can’t be referenced
Test t = new Test();
System.out.println(t.i);//valid
t.m1();
}
public void m1()
{
System.out.println(i);//valid
}

}
*/
class pen{
    String colur;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
}
class oopu{
    public static void main(String []args){
        pen pen1=new pen();
        pen1.colur="blue";
        pen1.type="gel";
        pen1.write();
    }
}

/*class Test
{
public static void main(String[] args) {
int x;
if(args.length>0)
{
x=10;
}else{
x = 20;
}
System.out.println(x);
}
}
*/
