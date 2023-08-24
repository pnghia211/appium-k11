package LAB_8;

import java.security.SecureRandom;

public class LAB_08_Horse extends LAB_08_Animal {
    public LAB_08_Horse() {
        int horseSpeed = new SecureRandom().nextInt(100);
        this.setSpeed(horseSpeed);
        this.setName("Horse");
    }

}
