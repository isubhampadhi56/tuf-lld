package creational.builder;
import java.util.*;
public class BurgerMeal {
    private final String bunType;
    private final String patty;

    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side;
    private final String drink;

    private BurgerMeal(BurgerBuilder builder){
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.side = builder.side;
        this.drink = builder.drink;
    }
    public void deliver(){
        System.out.println(bunType);
        System.out.println(patty);
        System.out.println(side);
        System.out.println(drink);
        System.out.println(hasCheese);
        System.out.println(toppings);
    }
    public static class BurgerBuilder{
        private final String bunType;
        private final String patty;

        private boolean hasCheese;
        private List<String> toppings;
        private String side;
        private String drink;

        public BurgerBuilder(String bunType,String patty){
            this.bunType = bunType;
            this.patty = patty;
        }
        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese = true;
            return this;
        }
        public BurgerBuilder withToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }
        public BurgerBuilder withSide(String side){
            this.side = side;
            return this;
        }
        public BurgerBuilder withDrink(String drink){
            this.drink = drink;
            return this;
        }
        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }

}
