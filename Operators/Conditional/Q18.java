// Q18: Output tracing
// int a = 3, b = 4, c = 5;
// int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
// System.out.println(result);
// Options: a) 3  b) 4  c) 5  d) 6
// Answer: c) 5
public class Q18 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Output: " + result);
        System.out.println("Correct Option: c) 5");
        System.out.println("Explanation: (3 > 4) is false -> evaluates (b > c ? b : c) -> (4 > 5) is false -> returns c = 5.");
    }
}
