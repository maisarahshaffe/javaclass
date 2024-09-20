//Super class

class Animal3 {
    public void sound(){
        System.out.println("Animal Sound");
    }
}
 class Dog3 extends Animal3 {
    public void bark(){
        System.out.println("Dog barks");
    }
 }

public class Casting {

    public static void main(String[] args) {
        Animal3 myAnimal = new Dog3();
        myAnimal.sound();

        if(myAnimal instanceof Dog3){
            Dog3 myDog = (Dog3) myAnimal;
            myDog.bark();
        }
    }

}
