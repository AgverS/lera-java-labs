class Test1 extends Test {
        private int arrows;
        public Test1(String name, int arrows) {
            super(name);
            this.arrows = arrows;
        }
        public int getArrows() {
            return arrows;
        }
        public void setArrows(int arrows) {
            this.arrows = arrows;
        }
        @Override
        public void attack() {
            System.out.println("Стрельба");
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println(super.name);
            System.out.println("Вид: " + arrows);

        }
    }
}