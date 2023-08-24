package LAB_11;

import java.security.SecureRandom;

public class LAB_11_Snake extends LAB_11_Animals {
    public LAB_11_Snake() {
        LAB11Moveable = new LAB_11_Moveable() {
            @Override
            public int speed() {
                return new SecureRandom().nextInt(40);
            }
        };
        LAB11FlyAble = new LAB_11_FlyWithWings() {
            @Override
            public boolean _flyable() {
                return false;
            }
        };
    }
}
