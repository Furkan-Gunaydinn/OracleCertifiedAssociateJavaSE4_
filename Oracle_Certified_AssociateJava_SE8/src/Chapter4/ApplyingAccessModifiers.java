package Chapter4;

public class ApplyingAccessModifiers {
    public class FatherDuck {
        private String noise = "quack";

        private void quak() {
            System.out.println(noise);
            //private acces is ok
        }
    }

    private void makeNoise() {
        quack();
    }

    private void quack() {
    }

    public class BadDuckling {
        public void makeNoise() {
            FatherDuck duck1 = new FatherDuck();
            duck1.quak(); //doen't compile
            System.out.println(duck1.noise);//doesn't compile
        }

    }

    public class MotherDuck {
        String noise = "quack";

        void quack() {
            System.out.println(noise);

        }

        private void makeNoise() {
            quack();
        }
    }

    public class GoodDuckling {
        public void makeNoise() {
            MotherDuck duck = new MotherDuck();
            duck.quack();
            System.out.println(duck.noise);
        }
    }

    public class BadCygnet {
        public void makeNoise() {
            MotherDuck duck = new MotherDuck();
            duck.quack(); // DOES NOT COMPILE
            System.out.println(duck.noise); // DOES NOT COMPILE
        }
    }

}
