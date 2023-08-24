package LAB_11;


import java.security.SecureRandom;

public class LAB_11_Dog extends LAB_11_Animals {

    public LAB_11_Dog() {
        LAB11FlyAble = new LAB_11_FlyWithWings() {
            @Override
            public boolean _flyable() {
                return false;
            }
        };

        LAB11Moveable = new LAB_11_Moveable() {
            @Override
            public int speed() {
                return new SecureRandom().nextInt(50);
            }
        };
    }
}

