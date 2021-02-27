package Chapter4;

public class Bird {

    protected String text = "floating";

    protected void floatInWater() {
        System.out.println(text);
    }

    public class Gosling extends Bird {
        public void swim() {
            floatInWater();
            System.out.println(text);
        }
    }

    public class BirdWatcher {
        public void watchBird() {
            Bird bird1 = new Bird();
            bird1.floatInWater();
            System.out.println(bird1.text);


        }

        public class BirdWatcherFromAfar {
            public void watchBird() {
                Bird bird2 = new Bird();
                bird2.floatInWater(); //doesn't compile

            }

        }
    }

    public class Swan extends Bird { // but subclass of bird
        public void swim() {
            floatInWater(); // package access to superclass
            System.out.println(text); // package access to superclass
        }

        public void helpOtherSwanSwim() {
            Swan other = new Swan();
            other.floatInWater(); // package access to superclass
            System.out.println(other.text);// package access to superclass
        }

        public void helpOtherBirdSwim() {
            Bird other = new Bird();
            other.floatInWater(); // DOES NOT COMPILE
            System.out.println(other.text); // DOES NOT COMPILE
        }
    }

    public class Goose extends Bird {
        public void helpGooseSwim() {
            Goose other = new Goose();
            other.floatInWater();
            System.out.println(other.text);
        }

        public void helpOtherGooseSwim() {
            Bird other = new Goose();
            other.floatInWater(); // DOES NOT COMPILE
            System.out.println(other.text); // DOES NOT COMPILE
        }
    }

    public class GooseWatcher {
        public void watch() {
            Goose goose = new Goose();
            goose.floatInWater(); // DOES NOT COMPILE
        }
    }
}
