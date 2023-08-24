package LAB_9;

public class LAB_09_Animals {

    public LAB_09_Animals() {
    }

    private int speed;
    private boolean withWings;
    private String name;

    protected LAB_09_Animals(Builder builder) {
        speed = builder.speed;
        name = builder.name;
        withWings = builder.withWings;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWing() {
        return withWings;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "speed=" + speed +
                ", withWing=" + withWings +
                ", name='" + name + '\'' +
                '}';
    }

    // Inner Class
    public static class Builder {
        private int speed;
        private boolean withWings;
        private String name;

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public LAB_09_Animals build() {
            return new LAB_09_Animals(this);
        }
    }


}
