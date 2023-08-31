package adapter;

public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());

        //adapter grocery which was incompatible with food
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));

    }


}
