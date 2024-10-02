public class CarSeller extends CarBond {
    String CarSellerName;
    String CarType;
    int CarPrice;
    String CarSellerPhone;
    String CarSellerID;
    String CarSellerTitle;

    {
        CarSellerName = "Car Seller";
        CarType = "Santa Fe";
        CarPrice = 35000000;
        CarSellerPhone = "+447863456789";
        CarSellerID = "45";
        CarSellerTitle = "Manager";
    }

    public void CarSold(){
        String CarSold = "Nissan";
        System.out.println("Car Sold" + " " +CarSold);
    }
    public void CarSoldDetails(){
        System.out.println("Sold by " + " " + CarSellerName);
        System.out.println("Car Type: " + " " + CarType);
        System.out.println("Car Price: " + " " + CarPrice);
        System.out.println("Car SellerPhone: " + " " + CarSellerPhone);
        System.out.println("Car SellerID: " + " " + CarSellerID);
        System.out.println("Car SellerTitle: " + " " + CarSellerTitle);
    }
    @Override
    public void CarDetails(){
        super.CarDetails();
    }
}
