package task3;

public class Main {
        public static void main(String[] args) {
            Exam[] exams = {
                    new Exam("Математика", ExamResult.EXCELLENT),
                    new Exam("Физика", ExamResult.PASS),
                    new Exam("Кроссплатформенное программирование", ExamResult.EXCELLENT),
                    new Exam("История", ExamResult.FAIL),
                    new Exam("Английский язык", ExamResult.PASS),
                    new Exam("Базы данных", ExamResult.EXCELLENT)
            };

            System.out.println("Все экзамены:");
            for (Exam e : exams) {
                System.out.println("  " + e);
            }

            System.out.println();
            System.out.println("Экзамены с результатом EXCELLENT:");
            for (Exam e : exams) {
                if (e.getResult() == ExamResult.EXCELLENT) {
                    System.out.println("  " + e.getSubject());
                }
            }
        }

}
