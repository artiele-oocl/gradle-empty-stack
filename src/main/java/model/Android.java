package model;

public class Android extends Mobile {
    private static final Integer LIMIT_EXCEEDED = 50;
    public Android(String name, String color, String brand) {
        super(name,color,brand);
    }
    @Override
    public String call(String input) {
        return "<Android>"+super.call(input);
    }
    @Override
    public String shouldMakeCall(String input) {
        if (call(input).length() > LIMIT_EXCEEDED) return "<Andriod> Message cannot be sent";
        else return call(input);
    }
}
