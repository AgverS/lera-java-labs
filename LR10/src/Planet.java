public class Planet implements Orbitable, Explorable {
    private String name;
    private double orbitTime;
    private String resources;

    public Planet(String name, double orbitTime, String resources) {
        this.name = name;
        this.orbitTime = orbitTime;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    @Override
    public void orbit() {
        System.out.println("Планета " + name + " вращается вокруг звезды. Период: "
                + Orbitable.formatOrbitTime(orbitTime));
    }

    @Override
    public double getOrbitTime() {
        return orbitTime;
    }

    @Override
    public void explore() {
        System.out.println("Исследуем планету " + name + "...");
    }

    @Override
    public String getResources() {
        return resources;
    }
}