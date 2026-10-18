// Q6: What is the value of the expression 45 & 1?
// Options: a) 1  b) 0  c) -1  d) none
// Answer: a) 1 (Least Significant Bit of odd number is 1)
public class Q06 {
    public static void main(String[] args) {
        int res = 45 & 1;
        System.out.println("45 & 1 = " + res);
        System.out.println("45 is odd, so its LSB is 1. Thus 45 & 1 = 1.");
    }
}
