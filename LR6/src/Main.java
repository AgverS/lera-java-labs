//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        // Создание двух объектов
        Student student1 = new Student("Иван Петров", 18, "ПО-21");
        Student student2 = new Student("Анна Смирнова", 19, "ПО-22");

        System.out.println(" Данные студентов ");
        student1.displayInfo();
        student2.displayInfo();

        // Изменение данных через сеттеры
        student1.setAge(19);
        student2.setGroup("ПО-31");

        // Попытка задать некорректное значение — сеттер его отклонит
        student1.setAge(-5);

        System.out.println(" После изменения ");
        student1.displayInfo();
        student2.displayInfo();

        // Чтение отдельных полей через геттеры
        System.out.println("Студент " + student1.getName()
                + " учится в группе " + student1.getGroup());
    }


