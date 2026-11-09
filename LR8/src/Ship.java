 class Ship extends Carrier {
    private double tonnage;
    public Ship(String name, double capacity, double speed, double tonnage) {
        super(name, capacity, speed);
        this.tonnage = tonnage;
    }
    public double getTonnage() {
        return tonnage;
    }
    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
    @Override
    public void deliver() {
        System.out.println("Перевозка по воде");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: судно, тоннаж: " + tonnage);
    }
    public void anchor() {
        System.out.println("Судно \"" + getName() + "\" бросает якорь");
    }
}
