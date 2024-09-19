public class DifferentScopes {

    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instanceVariableString = "This is a string";

    static int instanceVariableStatic = 20;

    public void showLocalVariable() {
        String localStringVariable = "Finish!";
        int localVariable = 30;
        System.out.println("My local Variable is: " + localVariable +" " + localStringVariable);
    }
    public static void main(String[] args) {
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local Variable is: " + example.instanceVariable +" " + example.instanceVariableString);
    }

}
