
// Enum: A special datatype that enables you to define a set of constants in java

// In this case, we will be assuming the products and its properties (price, name) will not
// change

public enum Product {
    // Twix (id, price), Coke (2, 100), Water (3, 30), Sandwich (4, 150)
    
    private int id;
    private int price;

    // Constructor
    Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    // This allows our code to follow the encapsulation method
    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }
}
