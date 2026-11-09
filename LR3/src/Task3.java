public class Task3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И.", 1250.5),
                new Employee("Петрова А.С.", 980.75),
                new Employee("Сидоренко Н.Н.", 2100.0),
                new Employee("Кузнецов В.П.", 1575.25)
        };
        Report.generateReport(employees);
    }
}
