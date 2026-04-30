package creational.abstractFactory;

public class IndiaFactory implements RegionFactory{
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType){
        if(gatewayType.equalsIgnoreCase("razorpay")){
            return new RazorPayGateway();
        }else if(gatewayType.equalsIgnoreCase("payu")){
            return new PayUGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for India: " + gatewayType);
    }
    @Override
    public Invoice createInvoice(){
        return new GSTInvoice();
    }
}
