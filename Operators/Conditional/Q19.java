// Q19: Output tracing
// int x = 10;
// int y = 5;
// int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
// System.out.println(z);
// Options: a) 10  b) 5  c) 15  d) none
// Answer: a) 10
public class Q19 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
        System.out.println("Output: " + z);
        System.out.println("Correct Option: a) 10");
        System.out.println("Explanation: (10 > 5) is true -> evaluates (10 < 15 ? 10 : 5) -> returns 10.");
    }
}
