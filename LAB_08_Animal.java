package LAB_8;

public abstract class LAB_08_Animal {

    private int speed;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
}
