package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler jump = new JumpHandler();
        jump.addNextHandler(new SwimHandler());
        jump.handleRequest("Swim");
    }
}

