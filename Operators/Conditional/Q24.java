// Q24: Output tracing
// int x = 5, y = 7, z = 3;
// int result = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
// System.out.println(result);
// Options: a) 5  b) 7  c) 3  d) Compilation error
// Answer: b) 7
public class Q24 {
    public static void main(String[] args) {
        int x = 5, y = 7, z = 3;
        int result = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Output: " + result);
        System.out.println("Correct Option: b) 7");
        System.out.println("Explanation: (5 > 7) is false -> evaluates (7 > 3 ? 7 : 3) -> returns 7.");
    }
}
