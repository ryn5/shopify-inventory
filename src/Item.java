public class Item {
    private String name;
    private int quantity;
    private Warehouse location;

    Item(String name, int quantity, Warehouse location) {
        this.name = name;
        this.quantity = quantity;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Warehouse getLocation() {
        return location;
    }

    public void setLocation(Warehouse location) {
        this.location = location;
    }
}
