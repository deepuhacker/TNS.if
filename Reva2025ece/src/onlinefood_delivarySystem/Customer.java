package onlinefood_delivarySystem;

public class Customer extends User {
    private Cart cart;

    public Customer(int userId, String username, long contactNo) {
        super(userId, username, contactNo);
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer{" + "cart=" + cart + ", " + super.toString() + '}';
    }
}
