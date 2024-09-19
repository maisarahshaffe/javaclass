public class Statement {
    public static void main(String[] args) {
        int num = 8;
        if(num>0){
            System.out.println("Number is Positive");
        }
        if(num>7){
            System.out.println("Number is greater than 7");
        } else {
            System.out.println("Number is less than 7");
        }
        if(num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
