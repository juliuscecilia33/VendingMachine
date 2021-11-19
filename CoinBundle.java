public class CoinBundle {
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    // Constructor
    public CoinBundle(int... enteredCoins) { // takes in an array of entered coins
        this.number5CentsCoins = enteredCoins[0];
        this.number10CentsCoins = enteredCoins[1];
        this.number20CentsCoins = enteredCoins[2];
        this.number50CentsCoins = enteredCoins[3];
        this.number100CentsCoins = enteredCoins[4];

    }
}

// part 2: 6:02
