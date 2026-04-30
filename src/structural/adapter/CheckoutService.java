package structural.adapter;

public class CheckoutService {
    private PaymentGateway gateway;
    public CheckoutService(PaymentGateway gateway){
        this.gateway = gateway;
    }
    public void checkout(String orderId, double amount){
        gateway.pay(orderId,amount);
    }
}
