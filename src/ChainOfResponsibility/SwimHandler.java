package ChainOfResponsibility;

public class SwimHandler implements Handler {
    private Handler next;

    @Override
    public void handleRequest(String request) {
        if(request.equals("Swim")) {
            System.out.println("Im doing request: Swimming!");
        } else if (this.next != null) {
            System.out.println("Poor swim handler couldn't handle the request");
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
