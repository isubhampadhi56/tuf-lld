package creational.abstractFactory;

public class USFactory implements RegionFactory{
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType){
        if(gatewayType.equalsIgnoreCase("paypal")){
            return new PayPalGateway();
        }else if(gatewayType.equalsIgnoreCase("stripe")){
            return new StripeGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for India: " + gatewayType);
    }
    @Override
    public Invoice createInvoice(){
        return new USInvoice();
    }
}
