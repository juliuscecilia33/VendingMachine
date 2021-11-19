public interface Calculator {
    int calculateTotal(CoinBundle enteredCoins); // returns an integer which is the total amount 
    CoinBundle calculateChange(int amountMoneyToReturn);
}
