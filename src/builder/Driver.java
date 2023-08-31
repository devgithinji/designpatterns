package builder;

public class Driver {

    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(true)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();
    }
}
