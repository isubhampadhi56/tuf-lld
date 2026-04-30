package structural.adapter;

public class Driver {
    public static void main(String[] args) {
        CheckoutService payu = new CheckoutService(new PayUGateway());
        payu.checkout("abcd",12.40);
        CheckoutService razorPay = new CheckoutService(new RazorPayAdapter());
        razorPay.checkout("asdfg",45.36);
    }
}
