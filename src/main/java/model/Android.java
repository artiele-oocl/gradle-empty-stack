package model;

public class Android extends Mobile {
    public Android() {
        super();
    }
    @Override
    public String call(String input) {
        return "<Android>"+super.call(input);
    }
}
