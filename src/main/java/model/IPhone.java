package model;

public class IPhone extends Mobile {
    private static final Integer LIMIT_EXCEEDED = 50;
    public IPhone(String name, String color, String brand) {
        super(name,color,brand);
    }
    @Override
    public String call(String input) {
        return "<iPhone>"+super.call(input);
    }

    @Override
    public String shouldMakeCall(String input) {
        if (call(input).length() > LIMIT_EXCEEDED) return "<iPhone> Message cannot be sent";
        else return call(input);
    }
}
