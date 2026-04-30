package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRegistry{
    private static final Map<String, EmailTemplate> templates = new HashMap<String,EmailTemplate>();
    static {
        templates.put("welcome", new WelcomeEmail());
        templates.put("discount",new DiscountEmail());
        templates.put("promotion",new PromotionEmail());
    }
    public static EmailTemplate getTemplate(String type){
        return templates.get(type).clone();
    }
}
