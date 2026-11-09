//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Carrier[] carriers = new Carrier[5];

    carriers[0] = new Ship("Посейдон", 5000, 35, 12000);
    carriers[1] = new Ship("Нептун", 8000, 30, 18000);
    carriers[2] = new Ship("Титан", 12000, 28, 25000);

    carriers[3] = new Truck("MAN", 20, 90, 6);
    carriers[4] = new Truck("Volvo", 25, 85, 10);

    for (Carrier c : carriers) {
        c.displayInfo();
        c.deliver();
        if (c instanceof Ship) {
            ((Ship) c).anchor();
        } else if (c instanceof Truck) {
            ((Truck) c).loadCargo();
        }
        System.out.println("=======================");
    }
}
