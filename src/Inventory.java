import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    public void viewItems() {
        for (Item i : items) {
            System.out.println(i.getName() + "\n");
        }
    }
}
