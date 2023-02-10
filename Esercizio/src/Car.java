public class Car {
    public String modelName;
    public int mileage;

    public Car(String modelName, int mileage){
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println("The name car is: " + modelName + " and the mileage is: " + mileage);
    }

    public void getCarDetails(){
        System.out.printf("The name car is: " + modelName + "%n" + "And the mileage is: " + mileage);
    }
}
