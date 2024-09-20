abstract class Animal5{
    public abstract void sound();

    public void sleep (){
        System.out.println("The animal is sleeping");
    }

}

class Dog5 extends Animal5{
    @Override
    public void sound(){
        System.out.println("barking");
    }
}


public class AbstractNew {

    public static void main(String[] args) {
        Dog5 d = new Dog5();
        d.sleep();
        d.sound();

    }
}
