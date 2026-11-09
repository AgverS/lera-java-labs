public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println(" Отчет по зарплате сотрудников ");
        System.out.printf("%-15s%10s%n", "ФИО", "Зарплата");
        for (Employee e : employees) {
            System.out.printf("%-15s|%10.2f%n", e.fullname, e.salary);
        }
    }
}
