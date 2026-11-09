public class Student {
    private String name;
    private int age;
    private String group;
    public Student(String name, int age, String group) {
        setName(name);
        setAge(age);
        setGroup(group);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getGroup() {
        return group;
    }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ошибка: имя не может быть пустым");
        }
    }
    public void setAge(int age) {
        if (age >= 14 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Ошибка: недопустимый возраст (" + age + ")");
        }
    }
    public void setGroup(String group) {
        if (group != null && !group.trim().isEmpty()) {
            this.group = group;
        } else {
            System.out.println("Ошибка: группа не может быть пустой");
        }
    }
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Группа: " + group);

    }
}

