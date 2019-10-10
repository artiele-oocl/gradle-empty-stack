package model;

public class Android extends Mobile {
    public Android() {
        super();
    }
    @Override
    public void call(String input) {
        System.out.println("<Android>Message : "+input);
    }
}
