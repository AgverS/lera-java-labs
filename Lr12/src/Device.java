public class Device {
    protected String model;
    protected int id;
    protected double power; // Вт

    public Device(String model, int id, double power) {
        this.model = model;
        this.id = id;
        this.power = power;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{model='" + model + "', id=" + id + ", power=" + power + " Вт";
    }
}
