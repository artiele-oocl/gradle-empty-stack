package User;

import model.Mobile;

public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String makeCall(Mobile mobile, String msg) {
        return mobile.shouldMakeCall(msg);
    }
}
