package User;

import model.IPhone;

public class IPhoneRobot {
    public String makeCall(IPhone iphone, String msg) {
        return iphone.shouldMakeCall(msg);
    }
}
