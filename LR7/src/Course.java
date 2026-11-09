public class Course {
        private String name;
        private int duration;
        private int students;
        private static int totalCourses = 0;
        private static int totalStudents = 0;
        public Course(String name, int duration, int students) {
            this.name = name;
            this.duration = duration;
            this.students = students;
            totalCourses++;
            totalStudents += students;
        }
    public void printInfo() {
        System.out.println("Курс: " + name + "  Длительность: " + duration
                + " ч  Студентов: " + students + " " + totalCourses + " " + totalStudents);
    }
        public String getName() {
            return name;
        }
        public int getDuration() {
            return duration;
        }
        public int getStudents() {
            return students;
        }
        public static int getTotalCourses() {
            return totalCourses;
        }
        public static int getTotalStudents() {
            return totalStudents;
        }
        public static double getAverageStudents() {
            if (totalCourses == 0) {
                return 0;
            }
            return (double) totalStudents / totalCourses;
        }
        public void displayInfo() {
            System.out.println("Курс: " + name + " | Длительность: " + duration
                    + " ч | Студентов: " + students);
        }
    }
