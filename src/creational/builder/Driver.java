package creational.builder;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
                .build();
        plainBurger.deliver();
        // Burger with cheese only
        BurgerMeal burgerWithCheese = new BurgerMeal.BurgerBuilder("wheat", "veg")
                .withCheese(true)
                .build();
        burgerWithCheese.deliver();
        // Fully loaded burger
        List<String> toppings = Arrays.asList("lettuce", "onion", "jalapeno");
        BurgerMeal loadedBurger = new BurgerMeal.BurgerBuilder("multigrain", "chicken")
                .withCheese(true)
                .withToppings(toppings)
                .withSide("fries")
                .withDrink("coke")
                .build();
        loadedBurger.deliver();
    }
}
