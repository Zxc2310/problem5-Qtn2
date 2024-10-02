public class Buyers extends CarBond {
    String BuyerName;
    String BuyerAddress;
    String BuyerPhone;
    String BuyerEmail;
    public Buyers(String BuyerName, String BuyerAddress, String BuyerPhone, String BuyerEmail) {
        this.BuyerName = BuyerName;
        this.BuyerAddress = BuyerAddress;
        this.BuyerPhone = BuyerPhone;
        this.BuyerEmail = BuyerEmail;
    }
    {
        BuyerName = "Abdurahman";
        BuyerAddress = "Kampala";
        BuyerPhone = "+25678945297";
        BuyerEmail = "abdurahman@gmail.com";

        System.out.println(BuyerName);
        System.out.println(BuyerAddress);
        System.out.println(BuyerPhone);

    }

    public void BuyerDetails() {
        System.out.println("Buyer Name: " + BuyerName);
        System.out.println("Buyer Address: " + BuyerAddress);
        System.out.println("Buyer Phone: " + BuyerPhone);
        System.out.println("Buyer Email: " + BuyerEmail);
    }

    @Override
    public void CarDetails(){
        super.CarDetails();
    }

}
