class Animal{

}
class Dog extends Animal{

}
class Shape{
    public Animal draw(){
        System.out.println("Draw any shape");
        return new Animal();
    }
}
class Rectangle extends Shape{
    public Dog draw(){
        System.out.println(" Rectangle shape");
    return new Dog();
    }
}
public class Covariant {
    public static void main(String args[]){
    Shape s=new Rectangle();
    s.draw();
    }
}
