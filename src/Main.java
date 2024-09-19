public class Main {
    public static void main(String[] args) {

        double salesTax = 0.05;
        double itemPrice = 12.78;
        double finalPrice = 0;
        double itemTax = 0;

        itemTax = itemPrice * salesTax;
        finalPrice = itemPrice + itemTax;

        System.out.println("Your sales tax is $" + itemTax);
        System.out.println("You total with tax is $" + finalPrice);

    }
}