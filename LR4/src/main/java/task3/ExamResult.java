package task3;

public enum ExamResult {

        PASS("сдан"),
        FAIL("не сдан"),
        EXCELLENT("отлично");
        private final String description;
        ExamResult(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }

}
