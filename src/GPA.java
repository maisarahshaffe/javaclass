public class GPA {
    private String pointer;
    private int years;

    public GPA(String pointer, int years) {
        this.pointer = pointer;
        this.years = years;
    }
    public void displayDetails() {
        System.out.println("My GPA is " + pointer);
        System.out.println("in");
        System.out.println(years + " years of study");
    }
    public static void main(String[] args) {
        GPA gpa = new GPA("3.5", 3);
        gpa.displayDetails();
    }
}
