//Super Class
class Animal {
    public void eat(){
        System.out.println("The animal is eating");
    }
}
//Subclass
class Dog extends Animal {
    public void bark(){
        System.out.println("The dog is barking");
    }
}

public class Inheritence {

    public static void main(String[] args) {
        Dog dog = new Dog(); //no need to use string bcs already create the class of dog
        dog.eat();
        dog.bark();
    }

}
