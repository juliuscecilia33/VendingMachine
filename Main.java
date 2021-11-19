import java.util.Scanner;

// The Main entry point of our program, orchestrates calls and classes
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct); // Right now product is a string, so we need to convert
        // to an integer

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();

        int[] enteredCoins = {}; 

        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayChangeMessage();
    }
}
