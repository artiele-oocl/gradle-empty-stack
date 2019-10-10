package model;

public class IPhone extends Mobile {
    public IPhone() {
        super();
    }
    @Override
    public String call(String input) {
        return "<iPhone>"+super.call(input);
    }
}
