// 1. Vending Machine displays a welcome message
// 2. It asks the user to select a product
// 3. Machine asks the user to enter coins
// 4. Machine calculates amount enter by user
// 5. it calculates the change
// 6. it calculates minimum number of coins
// 7. it displays a message with the change

public interface VendingMachine {
    // All the methods are vending machine needs

    void displayProducts(); // returning nothing

    void selectProduct(int product); // a number representing the product selected

    void displayEnterCoinsMessage();

    void enterCoins(int... coins); // ... represents an array of integers

    void displayChangeMessage();
}