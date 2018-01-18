package ChainOfResponsibility;

public interface Handler {
    void handleRequest(String request);
    void addNextHandler(Handler handler);
}
