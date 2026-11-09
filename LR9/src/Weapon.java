abstract class Weapon {
    private String name;
    private int damage;
    private double range;

    public Weapon(String name, int damage, double range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public double getRange() {
        return range;
    }
    public void setRange(double range) {
        this.range = range;
    }
    public abstract void attack();
    public abstract String getType();
    public boolean isLongRange() {
        return range > 10;
    }
    public void displayInfo() {
        System.out.println("Название: " + name + ", урон: " + damage + ", дальность: " + range + " м");
    }
}