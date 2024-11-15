class Super{
    void show(){
        System.out.println("Super class show method");
    }
}
class Sub extends Super{
    @Override
    public void show(){
        System.out.println("Sub class show method");
    }
}
public class AccessModifiers {
public static void main(String args[]){
    Super s=new Sub();
    s.show();
}
}
