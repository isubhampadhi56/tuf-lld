package creational.prototype;

class PromotionEmail implements EmailTemplate{
    private String subject,content;
    public PromotionEmail(){
        this.subject = "New Feature on TUF";
        this.content = "Introducing AI powered Code Compiler";
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
