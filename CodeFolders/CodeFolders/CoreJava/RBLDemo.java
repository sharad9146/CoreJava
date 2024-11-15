class RBI
{
    public void loan(){
        System.out.println("Providing instruction for loan");
    }
}
class SBI extends RBI
{
    @Override
    public void loan()
    {
            System.out.println("Providing loan @9.6");
    }
}
class BOB extends RBI{
    @Override
    public void loan(){
        System.out.println("Providing loan @10.2");
    }
}
public class RBLDemo {
    public static void main(String args[]){
        RBI r;
        r=new SBI();
        r.loan();
        r=new BOB();
        r.loan();
    }
}
