//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Planet earth = new Planet("Земля", 365.25, "вода, кислород, металлы");
    Planet mars = new Planet("Марс", 687, "железо, водяной лёд");
    Planet jupiter = new Planet("Юпитер", 4333, "водород, гелий");

    // 2 луны
    Moon moon = new Moon("Луна", 27.3, earth, "гелий-3, титан");
    Moon phobos = new Moon("Фобос", 0.32, mars, "углерод, силикаты");

    Orbitable[] bodies = {earth, mars, jupiter, moon, phobos};
    System.out.println("=== Обращение небесных тел ===");
    for (Orbitable body : bodies) {
        body.orbit();
    }

    System.out.println("\n=== Исследование ===");
    for (Orbitable body : bodies) {
        if (body instanceof Explorable) {
            Explorable e = (Explorable) body;
            e.explore();
            System.out.println("   Ресурсы: " + e.getResources());
        }
    }
}
