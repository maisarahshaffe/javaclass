public class Switch {
    public static void main(String[] args) {
        int dayOfweek = 5;
        String dayName;
        switch (dayOfweek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Value";
                break;
        }
        System.out.println(dayName);
    }
}
