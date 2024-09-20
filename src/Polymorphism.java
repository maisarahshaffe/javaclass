class Animal2{
    public void sound(){ //default
        System.out.println("Some Sound");
    }
}

//Subclass #1
class Dog2 extends Animal2{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

//Subclass #2
class Cat extends Animal2{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

//Subclass #3
class Cow extends Animal2{
    @Override
    public void sound(){
        System.out.println("Moo");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal2 myAnimal = new Dog2();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();
    }
}