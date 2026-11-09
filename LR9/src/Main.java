//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        System.out.println("Weapon - абстрактный класс, new Weapon(...) вызывает ошибку компиляции.");
        System.out.println("==============================");
        Weapon[] weapons = new Weapon[5];
        weapons[0] = new Sword("Клинок рыцаря", 35, 1.2, 8);
        weapons[1] = new Sword("Катана", 40, 1.0, 10);
        weapons[2] = new Sword("Палаш", 30, 1.1, 6);
        weapons[3] = new Bow("Длинный лук", 25, 150, 30);
        weapons[4] = new Bow("Короткий лук", 18, 80, 20);
        for (Weapon w : weapons) {
            w.displayInfo();
            w.attack();
            System.out.println("Тип оружия: " + w.getType());
            System.out.println("Дальнобойное: " + (w.isLongRange() ? "да" : "нет"));
            System.out.println("------------------------------");
        }
    }
