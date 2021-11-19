
// Enum: A special datatype that enables you to define a set of constants in java

// In this case, we will be assuming the products and its properties (price, name) will not
// change

public enum Product {
    TWIX(1,100), COKE(2,50), WATER(3,30), SANDWICH(4,150), EMPTY(0,0);
    
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

    public static Product valueOf(int productSelected) {
        for (Product product : Product.values()) {
            if (productSelected == product.getId()) {
                return product;
            }
        }
        return null;
    }
}
