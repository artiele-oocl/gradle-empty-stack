package model;

public class IPhone extends Mobile {
    public IPhone() {
        super();
    }
    @Override
    public void call(String input) {
        System.out.println("<iPhone>Message : "+input);
    }
}
