package creational.prototype;

class WelcomeEmail implements EmailTemplate{
    private String subject,content;
    public WelcomeEmail(){
        this.subject = "Welcome to TUF";
        this.content = "Hi there! Thanks for joining us.";
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
