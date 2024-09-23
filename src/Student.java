public class Student {

    private String name;
    private int scores[] = {0,0,0};
    private int averageScore;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int CalculateAverageScore() {

        int total = 0;
        for (int score:scores) {
            total += score;
        }
        this.averageScore = (total) / 3;
        return averageScore;
    }
    public String assignGrade(){
        String grade = "";
        if(averageScore>=90){
            grade = "A";
        }
        if(averageScore >= 80 && averageScore <= 89){
            grade = "B";
        }
        else if(averageScore >= 70 && averageScore <= 79){
            grade = "C";
        }
        else if(averageScore >= 60 && averageScore <= 69){
            grade = "D";
        }
        if(averageScore <=60){
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        Student[] student = new Student[5];

        student[0] = new Student("Far", new int[] {85,70,55});
        student[1] = new Student("Alif", new int[] {30,60,90});
        student[2] = new Student("Faizul",new int[] {90,86,73});
        student[3] = new Student("Mai", new int[] {90,94,98});
        student[4] = new Student("Sal", new int[] {25,45,35});

        for (int i = 0; i < student.length; i++) {
            System.out.println("\nStudent:" + student[i].getName() + "\nAverage Score: " + student[i].CalculateAverageScore() + "\nGrade: " + student[i].assignGrade());
        }
    }


}
