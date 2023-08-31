package adapter;

public class GroceryItemAdapter implements Item {

    private GroceryItem item;

    public GroceryItemAdapter(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getName();
    }

    @Override
    public String getPriceName() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }
}
