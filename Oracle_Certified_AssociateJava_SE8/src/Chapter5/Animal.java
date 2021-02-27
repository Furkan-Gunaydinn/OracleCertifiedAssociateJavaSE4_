package Chapter5;

public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(int age, String gorilla) {
        super();
        this.age = age;
    }

    public class Zebra extends Animal {
        public Zebra(int age) {
            super(age, "Gorilla");
        }


        public Zebra() {

            this(4);
        }
    }

    public class Zoo {
        public Zoo() {
            super();
            System.out.println("Zoo created");

        }

    }

    public class Gorilla extends Animal {
        public Gorilla(int age) {
            super(age, "Gorilla");
        }

        public Gorilla() {
            super(5, "Gorilla");
        }
    }


}

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}

class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}