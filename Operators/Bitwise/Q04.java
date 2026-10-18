// Q4: What is the value of the expression ~16?
// Options: a) -15  b) -16  c) -17  d) -18
// Answer: c) -17 (~n = -(n + 1))
public class Q04 {
    public static void main(String[] args) {
        int res = ~16;
        System.out.println("~16 = " + res);
        System.out.println("Formula: ~n = -(n + 1) -> -(16 + 1) = -17");
    }
}
