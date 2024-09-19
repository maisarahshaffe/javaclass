public class Exercise2 {
    private String carModel;
    private double GasUsage;

public String getCarModel() {
    return carModel;
}
    public void setGasUsage (double gasUsage) {

    }

    public static void main(String[] args) {

        String[][] carModel = {
                {"Saga", "Persona"}, //array
                {"Bezza", "Aruz"},
        };
        for (String[] array : carModel) {
            for (String GasUsage : array) {
                System.out.println(GasUsage);


            }
        }
    }



}
