package LAB_8;

import java.security.SecureRandom;

public class LAB_08_Tiger extends LAB_08_Animal {
    public LAB_08_Tiger() {
        int tigerSpeed = new SecureRandom().nextInt(75);
        this.setSpeed(tigerSpeed);
        this.setName("Tiger");
    }
}
