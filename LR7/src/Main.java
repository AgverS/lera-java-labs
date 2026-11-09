//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Курсов до создания объектов: " + Course.getTotalCourses());
    System.out.println();

    // Создание 4 курсов
    Course c1 = new Course("Основы Java", 72, 25);
    Course c2 = new Course("Базы данных", 48, 18);
    Course c3 = new Course("Веб-разработка", 96, 30);
    Course c4 = new Course("Алгоритмы", 60, 15);

    System.out.println(" Список курсов ");
    c1.displayInfo();
    c2.displayInfo();
     c3.displayInfo();
    c4.displayInfo();
    c4.printInfo();
    System.out.println();
    System.out.println(" Общая статистика ");
    System.out.println("Всего курсов: " + Course.getTotalCourses());
    System.out.println("Всего студентов: " + Course.getTotalStudents());
    System.out.printf("Среднее число студентов на курс: %.2f%n",
            Course.getAverageStudents());
}
