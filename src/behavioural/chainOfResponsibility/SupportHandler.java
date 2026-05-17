package behavioural.chainOfResponsibility;

abstract public class SupportHandler {
    protected SupportHandler nextHandler;
    public void setNextHandler(SupportHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest(String requestType);
}

