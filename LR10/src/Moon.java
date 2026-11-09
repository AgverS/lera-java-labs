public class Moon implements Orbitable, Explorable {
    private String name;
    private double orbitTime;
    private Planet planet;
    private String resources;

    public Moon(String name, double orbitTime, Planet planet, String resources) {
        this.name = name;
        this.orbitTime = orbitTime;
        this.planet = planet;
        this.resources = resources;
    }

    @Override
    public void orbit() {
        System.out.println("Луна " + name + " вращается вокруг планеты " + planet.getName()
                + ". Период: " + Orbitable.formatOrbitTime(orbitTime));
    }

    @Override
    public double getOrbitTime() {
        return orbitTime;
    }

    @Override
    public void explore() {
        System.out.println("Исследуем луну " + name + " (спутник планеты " + planet.getName() + ")...");
    }

    @Override
    public String getResources() {
        return resources;
    }
}