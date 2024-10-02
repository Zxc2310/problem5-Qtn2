//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         CarSeller CS = new CarSeller();
         Buyers B = new Buyers("Abdi","Zana","+231836234","abdi@gmail.com");

         CS.CarDetails();
         B.CarDetails();

         CS.CarSold();
         CS.CarSoldDetails();

         B.BuyerDetails();

    }
}