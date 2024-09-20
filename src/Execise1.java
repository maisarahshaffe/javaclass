public class Execise1 {

    public static void main(String[] args) {

        String dayName = "";
        int increment = 100;
        int calories = 1700;

        for (int d = 2; d <= 7; d++){

            switch (d) {
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
                        break;
            }

            if (d>=3) {
                calories += increment;
            }

            System.out.println(dayName + " " + calories);
        }
    }

}
