import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double Itemprice;
        double ShippingCost;
        double Totalprice;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Item price");

        Itemprice = scanner.nextDouble();

        if (Itemprice>= 100)
        {
            ShippingCost=0;

        }
    else {

       ShippingCost = 0.2 * Itemprice;


        }
    Totalprice= Itemprice+ShippingCost;

    System.out.println("The shipping cost is " + ShippingCost+ "$");
    System.out.println("The Total Price is " + Totalprice+ "$");





        String userName = scanner.nextLine();
        System.out.println("Username is: " + userName);


    }
}