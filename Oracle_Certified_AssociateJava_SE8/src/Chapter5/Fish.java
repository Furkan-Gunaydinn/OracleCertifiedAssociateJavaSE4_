package Chapter5;

public class Fish {


        protected int size;
        private int age;

        public Fish(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }


    public class Shark extends Fish {
        private int numberOfFins = 8;

        public Shark(int age) {
            super(age);
            this.size = 4;
        }

        public void displaySharkDetails(String numberOfFins) {
            System.out.print("Shark with age: " + getAge());
        }
    }
    public void displaySharkDetails(String numberOfFins) {
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");
    }
}


