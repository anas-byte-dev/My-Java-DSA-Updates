// Q21: Output tracing
// int a = 1, b = 2, c = 3;
// int result = a < b ? a < c ? c : a : b;
// System.out.println(result);
// Options: a) 1  b) 2  c) 3  d) Compile Time Error
// Answer: c) 3
public class Q21 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int result = a < b ? a < c ? c : a : b;
        System.out.println("Output: " + result);
        System.out.println("Correct Option: c) 3");
        System.out.println("Explanation: Right-associative ternary: (1 < 2) is true -> (1 < 3 ? 3 : 1) -> evaluates to 3.");
    }
}
