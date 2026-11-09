 class Carrier {
    private String name;
    private double capacity;
    private double speed;
    public Carrier(String name, double capacity, double speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void deliver() {
        System.out.println("Доставка груза");
    }
    public void displayInfo() {
        System.out.println("Название: " + name + ", грузоподъемность: " + capacity + " т" + ", скорость: " + speed + " км/ч");
    }

}
