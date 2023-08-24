package LAB_11;

public class LAB_11_Falcon extends LAB_11_Animals {
    public LAB_11_Falcon() {
        LAB11Moveable = new LAB_11_Moveable() {
            @Override
            public int speed() {
                return 1000;
            }
        };

        LAB11FlyAble = new LAB_11_FlyWithWings() {
            @Override
            public boolean _flyable() {
                return true;
            }
        };
    }
}
