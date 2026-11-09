 class Bow extends Weapon {
    private int arrows;
    public Bow(String name, int damage, double range, int arrows) {
        super(name, damage, range);
        this.arrows = arrows;
    }
    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    @Override
    public void attack() {
        System.out.println("Стрельба из лука");
    }
    @Override
    public String getType() {
        return "Метательное оружие";
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Вид: лук, стрел в колчане: " + arrows);
    }
}