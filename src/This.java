class Animal4{
    String name;

    public Animal4(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name + " make a sound");
    }
}

//subclass 1

class Dog4 extends Animal4{
    public Dog4(String name){
        super(name);         //'this' is connected to super
    }
    @Override
    public void sound(){
        super.sound();
        System.out.println(name + " barks");
    }
}

public class This {

    public static void main(String[] args) {
        Dog4 d = new Dog4("Angeer");
        d.sound();
    }
}
