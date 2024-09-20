interface Animal6{
    void sound();
}

interface Playball{
    void play();
}

class Dog6 implements Animal6, Playball{
    @Override
    public void sound() {
    System.out.println("bark");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class InterfaceSample {
    public static void main(String[] args) {
        Dog6 d = new Dog6();
        d.sound();
        d.play();
    }
}
