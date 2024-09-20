public class Exercise2 {
    private int petrolUsage;
    private String carType;

    public int getPetrolUsage() {
        return petrolUsage;
    }

    public String getCarType() {
        return carType;
    }

    public void setPetrolUsage(int petrolUsage) {
        this.petrolUsage = petrolUsage;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public static void main(String[] args){  //output

        Exercise2 usage = new Exercise2();

        int[][] gas = new int[2][2];

        gas[0][0] = 20;
        gas[0][1] = 25;
        gas[1][0] = 17;
        gas[1][1] = 10;

        String[][] car = new String [2][2];

        car[0][0] = "Toyota";
        car[0][1] = "Nissan";
        car[1][0] = "Proton";
        car[1][1] = "Perodua";

        for(int row = 0; row < car.length; row++) {
            for (int col = 0; col < car[row].length; col++) {
                usage.setCarType(car[row][col]);
                usage.setPetrolUsage(gas[row][col]);

                System.out.println(usage.getCarType() + " " + usage.getPetrolUsage());
            }
        }


    }
}