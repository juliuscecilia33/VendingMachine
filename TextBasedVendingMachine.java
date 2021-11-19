
// Why are we creating a class from an interface? Using the encapsulation principle 

public class TextBasedVendingMachine implements VendingMachine {
    @Override
    public void displayProducts() {
        // Displays a welcome message and all the products available
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        System.out.println("            Products available:               ");
        System.out.println("                                              ");

        for (Product product : Product.values()) {
            System.out.println("    " + product.getId() + " " + product.name() + " - Price: " + product.getPrice());
        }

        System.out.println("                                              ");
        System.out.println(" Please select your product: ");
    }

    @Override
    public void selectProduct(int product) {
        
    }

    @Override
    public void displayEnterCoinsMessage() {
        
    }

    @Override
    public void enterCoins(int... coins) {
        
    }

    @Override
    public void displayChangeMessage() {
        
    }
}
