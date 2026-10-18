// Q25: Output tracing
// int x = 5, y = 7, z = 3;
// int result = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
// System.out.println(result);
// Options: a) 5  b) 7  c) 3  d) Compilation error
// Answer: c) 3
public class Q25 {
    public static void main(String[] args) {
        int x = 5, y = 7, z = 3;
        int result = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
        System.out.println("Output: " + result);
        System.out.println("Correct Option: c) 3");
        System.out.println("Explanation: (5 < 7) is true -> evaluates (5 < 3 ? 5 : 3) -> returns 3.");
    }
}
