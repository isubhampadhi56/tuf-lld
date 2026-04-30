package structural.adapter;

public class RazorPayAdapter implements PaymentGateway {
    private RazorPayAPI razorPayAPI;
    public RazorPayAdapter(){
        razorPayAPI = new RazorPayAPI();
    }
    public void pay(String orderId, double amount){
        razorPayAPI.makePayment(orderId,amount);
    }
}
