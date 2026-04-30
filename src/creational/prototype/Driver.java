package creational.prototype;

public class Driver {
        public static void main(String[] args) {
            EmailTemplate welcomeEmail1 = EmailTemplateRegistry.getTemplate("welcome");
            welcomeEmail1.setContent("Hi Alice, welcome to TUF Premium!");
            welcomeEmail1.send("alice@example.com");

            EmailTemplate welcomeEmail2 = EmailTemplateRegistry.getTemplate("welcome");
            welcomeEmail2.setContent("Hi Bob, thanks for joining!");
            welcomeEmail2.send("bob@example.com");

            // Reuse the base WelcomeEmail structure, just changing dynamic content
        }
}
