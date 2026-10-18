// Q14: What is the value of the expression 20 >>> 2?
// Options: a) 5  b) 10  c) 20  d) 80
// Answer: a) 5 (Unsigned right shift for positive numbers matches >>)
public class Q14 {
    public static void main(String[] args) {
        int res = 20 >>> 2;
        System.out.println("20 >>> 2 = " + res);
        System.out.println("For positive integers, >>> produces the same result as >> (5).");
    }
}
