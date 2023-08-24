package LAB_11;

public class LAB_11_Animals {
    LAB_11_FlyAble LAB11FlyAble;
    LAB_11_Moveable LAB11Moveable;
    String name;

    public LAB_11_Animals() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoveable() {
        return LAB11Moveable.speed();
    }

    public String getName() {
        return name;
    }

    public boolean getFlyAble() {
        return LAB11FlyAble._flyable();
    }

    @Override
    public String toString() {
        return "Animals{" +
                "flyAble=" + LAB11FlyAble +
                ", moveable=" + LAB11Moveable +
                ", name='" + name + '\'' +
                '}';
    }
}
