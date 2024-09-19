public class CGPA {
    private int gpa1;
    private double gpa2;
    private double gpa3;
    private double CGPA;

    public CGPA(int gpa1,double gpa2,double gpa3,double CGPA) {
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
        this.CGPA = CGPA;
    }
    public static void main(String[] args) {
        int gpa1 = 3;
        double gpa2 = 3.5;
        double gpa3 = 3.7;
        double CGPA = (gpa1 + gpa2 + gpa3)/3;
        System.out.println(CGPA);
    }

}
