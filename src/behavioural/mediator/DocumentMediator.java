package behavioural.mediator;

public interface DocumentMediator {
    void broadcastChange(String change, User sender);
    void join(User user);
}
