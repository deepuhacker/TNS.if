package onlinefood_delivarySystem;

public class DeliveryPerson {
    private int deliveryPersonId;
    private String name;
    private long contactNo;

    public DeliveryPerson(int deliveryPersonId, String name, long contactNo) {
        this.deliveryPersonId = deliveryPersonId;
        this.name = name;
        this.contactNo = contactNo;
    }

    // Getters
    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public String getName() {
        return name;
    }

    public long getContactNo() {
        return contactNo;
    }

    @Override
    public String toString() {
        return "DeliveryPerson{deliveryPersonId=" + deliveryPersonId + ", name='" + name + "', contactNo=" + contactNo + '}';
    }
}
