// Q17: Output tracing
// What is the output of the program:
// int a = 5, b = 10;
// int c = (a > b) ? a++ : b++;
// System.out.println(a + " " + b + " " + c);
// Options: a) 5 11 5  b) 6 10 6  c) 5 11 10  d) 6 11 10
// Answer: c) 5 11 10
public class Q17 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = (a > b) ? a++ : b++;
        System.out.println("Output: " + a + " " + b + " " + c);
        System.out.println("Correct Option: c) 5 11 10");
        System.out.println("Explanation: (a > b) is (5 > 10) which is false, so b++ evaluates.");
        System.out.println("Post-increment returns original b (10) for c, then increments b to 11. 'a' remains 5.");
    }
}
