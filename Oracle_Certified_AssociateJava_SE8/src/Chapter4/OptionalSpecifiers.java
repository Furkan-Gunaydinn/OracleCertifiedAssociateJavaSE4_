package Chapter4;

public class OptionalSpecifiers {

    public void walk1() {
    }

    public final void walk2() {
    }

    public static final void walk3() {
    }

    public final static void walk4() {
    }

    // public modifier void walk5() {} // DOES NOT COMPILE cause this initialize wrong
    //public void final walk6() {} // DOES NOT COMPILE at the same time wrong
    final public void walk7() {
    }
}
