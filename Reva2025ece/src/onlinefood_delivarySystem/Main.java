package onlinefood_delivarySystem;

public class Main { 
    public static void main(String[] args) {
        // Create some food items
        FoodItem pizza = new FoodItem(1, "Pizza", 9.99);
        FoodItem burger = new FoodItem(2, "Burger", 5.99);

        // Create a restaurant and add food items
        Restaurant restaurant = new Restaurant(1, "Gourmet Bistro");
        restaurant.addFoodItem(pizza);
        restaurant.addFoodItem(burger);

        // Create a customer
        Customer customer = new Customer(1, "John Doe", 1234567890L);
        Cart cart = customer.getCart();
        cart.addItem(pizza, 2);
        cart.addItem(burger, 1);

        // Create an order
        Order order = new Order(1, customer);
        order.addItem(pizza, 2);
        order.addItem(burger, 1);
        order.setDeliveryAddress("123 Main Street");

        // Create a delivery person
        DeliveryPerson deliveryPerson = new DeliveryPerson(1, "Jane Smith", 9876543210L);
        order.setDeliveryPerson(deliveryPerson);

        // Print out the details
        System.out.println(restaurant);
        System.out.println(customer);
        System.out.println(order);
    }
}

