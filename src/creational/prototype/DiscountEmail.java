package creational.prototype;

class DiscountEmail implements EmailTemplate{
    private String subject,content;
    public DiscountEmail(){
        this.subject = "SALE SALE";
        this.content = "Hi there! Your Coupon code is 2025ALL";
    }
    public WelcomeEmail clone(){
        try{
            return (WelcomeEmail) super.clone();
        }catch(CloneNotSupportedException e){
            throw new RuntimeException("Clone failed",e);
        }
    }
    public void setContent(String content){
        this.content = content;
    }
    public void send(String to){
        System.out.println("Sending to " + to + ": [" + subject + "] " + content);
    }
}
