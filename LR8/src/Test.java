abstract class Test {
    protected String name;
    public Test(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public void displayInfo() {
        System.out.println("Название: " + name);
    }
}