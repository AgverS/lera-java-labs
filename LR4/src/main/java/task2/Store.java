package task2;

public class Store {
        private String name;
        private double area;
        private int employees;

        public Store(String name, double area, int employees) {
            this.name = name;
            this.area = area;
            this.employees = employees;
        }

        public String getName() { return name; }
        public double getArea() { return area; }
        public int getEmployees() { return employees; }

        @Override
        public String toString() {
            return "Магазин \"" + name + "\" (площадь: " + area + " м², сотрудников: " + employees + ")";
        }

}
