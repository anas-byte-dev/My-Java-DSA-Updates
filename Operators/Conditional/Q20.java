// Q20: Output tracing
// int x = 10;
// int y = 5;
// int z = 7;
// int result = (x < y) ? (y < z ? z : y) : x;
// System.out.println(result);
// Options: a) 10  b) 5  c) 7  d) Compilation error
// Answer: a) 10
public class Q20 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 7;
        int result = (x < y) ? (y < z ? z : y) : x;
        System.out.println("Output: " + result);
        System.out.println("Correct Option: a) 10");
        System.out.println("Explanation: (10 < 5) is false -> directly returns x = 10.");
    }
}
