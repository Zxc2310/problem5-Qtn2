public class CarBond {
    int CarID;
    String CarName;
    String CarBrand;
    String CarModel;
    String CarYear;
    int CarPrice;
    public CarBond() {
        CarID = 234;
        CarName = "Snowball";
        CarBrand = "Honda";
        CarModel = "CR-V";
        CarYear = "2022";
        CarPrice = 47000000;
    }
     public void CarDetails() {
        System.out.println("Car ID: " + CarID);
        System.out.println("Car Name: " + CarName);
        System.out.println("Car Brand: " + CarBrand);
        System.out.println("Car Model: " + CarModel);
        System.out.println("Car Year: " + CarYear);
        System.out.println("Car Price: " + CarPrice);
     }

}
