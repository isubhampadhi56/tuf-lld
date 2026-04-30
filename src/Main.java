import creational.abstractFactory.CheckoutService;
import creational.abstractFactory.IndiaFactory;
import creational.abstractFactory.USFactory;
import creational.builder.BurgerMeal;
import creational.factory.Logistic;
import creational.factory.LogisticFactory;
import creational.singleton.BillPughSingleton;
import creational.singleton.EagarSingleton;
import creational.singleton.LazySingleton;
import creational.singleton.SyncSingleton;
import java.util.*;
public class Main {
//    public static void main(String[] args) {
//        EagarSingleton cls1 = EagarSingleton.getInstance();
//        cls1.print();
//        LazySingleton cls2 = LazySingleton.getInstance();
//        cls2.print();
//        BillPughSingleton cls3 = BillPughSingleton.getInstance();
//        cls3.print();
//        Logistic cls4 = LogisticFactory.getLogistic("air");
//        cls4.send();
//        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
//                .build();
//        plainBurger.deliver();
//        // Burger with cheese only
//        BurgerMeal burgerWithCheese = new BurgerMeal.BurgerBuilder("wheat", "veg")
//                .withCheese(true)
//                .build();
//        burgerWithCheese.deliver();
//        // Fully loaded burger
//        List<String> toppings = Arrays.asList("lettuce", "onion", "jalapeno");
//        BurgerMeal loadedBurger = new BurgerMeal.BurgerBuilder("multigrain", "chicken")
//                .withCheese(true)
//                .withToppings(toppings)
//                .withSide("fries")
//                .withDrink("coke")
//                .build();
//        loadedBurger.deliver();
//    }
        public static void main(String[] args) {
            // Using Razorpay in India
            CheckoutService indiaCheckout = new CheckoutService(new IndiaFactory(), "razorpay");
            indiaCheckout.completeOrder(1999.0);

            System.out.println("---");

            // Using PayPal in US
            CheckoutService usCheckout = new CheckoutService(new USFactory(), "paypal");
            usCheckout.completeOrder(49.99);
        }
}