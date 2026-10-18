// Q13: What is the value of the expression 20 << 2?
// Options: a) 5  b) 10  c) 20  d) 80
// Answer: d) 80 (Left shift by 2 is equivalent to multiplication by 2^2 = 4)
public class Q13 {
    public static void main(String[] args) {
        int res = 20 << 2;
        System.out.println("20 << 2 = " + res);
        System.out.println("Formula: 20 * (2^2) = 20 * 4 = 80.");
    }
}
