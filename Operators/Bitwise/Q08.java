// Q8: What is the value of the expression 18 | ~18?
// Options: a) 1  b) 0  c) -1  d) none
// Answer: c) -1 (For any integer n, n | ~n produces all 1s in 2's complement = -1)
public class Q08 {
    public static void main(String[] args) {
        int res = 18 | ~18;
        System.out.println("18 | ~18 = " + res);
        System.out.println("For any integer n, n | ~n = -1 (all bits set to 1).");
    }
}
