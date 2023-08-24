package LAB_8;

import java.security.SecureRandom;

public class LAB_08_Dog extends LAB_08_Animal {
    public LAB_08_Dog() {
        int dogSpeed = new SecureRandom().nextInt(60);
        this.setSpeed(dogSpeed);
        this.setName("Dog");
    }

}
