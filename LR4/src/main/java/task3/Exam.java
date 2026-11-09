package task3;

public class Exam {

        private String subject;
        private ExamResult result;

        public Exam(String subject, ExamResult result) {
            this.subject = subject;
            this.result = result;
        }

        public String getSubject() { return subject; }
        public ExamResult getResult() { return result; }

        @Override
        public String toString() {
            return subject + " — " + result + " (" + result.getDescription() + ")";
        }

}
