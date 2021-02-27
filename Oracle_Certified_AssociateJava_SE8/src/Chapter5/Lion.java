package Chapter5;

public class Lion extends Animal {
    public Lion(int age) {
        super(age, "Gorilla");
    }

    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }
}
