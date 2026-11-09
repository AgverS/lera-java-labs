package task2;

public class Main {
        public static void main(String[] args) {
            Store[] stores = {
                    new Store("Евроопт", 850.5, 42),
                    new Store("Гиппо", 3200.0, 120),
                    new Store("Корона", 5400.0, 95),
                    new Store("Соседи", 1200.0, 60),
                    new Store("Мила", 300.0, 15)
            };

            System.out.println("Все магазины:");
            for (Store s : stores) {
                System.out.println("  " + s);
            }

            Store maxArea = stores[0];
            Store maxEmployees = stores[0];
            for (int i = 1; i < stores.length; i++) {
                if (stores[i].getArea() > maxArea.getArea()) {
                    maxArea = stores[i];
                }
                if (stores[i].getEmployees() > maxEmployees.getEmployees()) {
                    maxEmployees = stores[i];
                }
            }

            System.out.println();
            System.out.println("Магазин с максимальной площадью: " + maxArea);
            System.out.println("Магазин с максимальным количеством сотрудников: " + maxEmployees);
        }

}
