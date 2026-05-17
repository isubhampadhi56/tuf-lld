package behavioural.visitor;

public class InvoiceVisitor implements ItemVisitor{
    @Override
    public void visit(PhysicalProduct item) {
        System.out.println("Invoice: " + item.name + " - Shipping to customer");
    }

    @Override
    public void visit(DigitalProduct item) {
        System.out.println("Invoice: " + item.name + " - Email with download link");
    }

    @Override
    public void visit(GiftCard item) {
        System.out.println("Invoice: Gift Card - Code: " + item.code);
    }
}
