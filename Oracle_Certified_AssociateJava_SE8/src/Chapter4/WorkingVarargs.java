package Chapter4;

public class WorkingVarargs {

    public void walk1(int nums) {
    }

    public void walk2(int start, int nums) {
    }

    public void walk3(int nums, int start) {
        // DOES NOT COMPILE
    }

    public void walk4(int start, int nums) {
        // DOES NOT COMPILE
    }

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk(1); // 0
        walk(1, 2); // 1
        walk(1, 2, 3); // 2
        walk(1); // 2
    }
}

