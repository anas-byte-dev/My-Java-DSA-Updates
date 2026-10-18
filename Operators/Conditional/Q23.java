// Q23: Output tracing
// int val = 10;
// int result = (val > 5) ? (val < 8 ? 1 : 2) : 3;
// System.out.println(result);
// Options: a) 1  b) 2  c) 3  d) Compilation error
// Note: If variable name is typo 'value', it causes compilation error (d).
// With declared variable 'val', the logic evaluates to: b) 2.
public class Q23 {
    public static void main(String[] args) {
        int val = 10;
        int result = (val > 5) ? (val < 8 ? 1 : 2) : 3;
        System.out.println("Output: " + result);
        System.out.println("Evaluation Result: b) 2");
        System.out.println("Explanation: (10 > 5) is true -> (10 < 8 ? 1 : 2) -> (10 < 8) is false -> returns 2.");
        System.out.println("Note: If slide typo 'value' vs 'val' is tested literally, compiler gives 'd) Compilation error'.");
    }
}
