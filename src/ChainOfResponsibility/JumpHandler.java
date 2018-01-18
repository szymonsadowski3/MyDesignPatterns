package ChainOfResponsibility;

public class JumpHandler implements Handler {
    private Handler next;

    @Override
    public void handleRequest(String request) {
        if(request.equals("Jump")) {
            System.out.println("Im doing request: Jumping!");
        } else if (this.next != null) {
            System.out.println("Poor jump handler couldn't handle the request");
            this.next.handleRequest(request);
        } else {
            System.out.println("Couldn't handle the request :(");
        }
    }

    @Override
    public void addNextHandler(Handler handler) {
        this.next = handler;
    }
}
