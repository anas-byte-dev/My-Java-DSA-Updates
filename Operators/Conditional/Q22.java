// Q22: Output tracing
// int a = 5;
// int b = 10;
// int c = (a > b) ? b++ : (a < b ? --b : b);
// System.out.println(c);
// Options: a) 5  b) 6  c) 10  d) 9
// Answer: d) 9
public class Q22 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = (a > b) ? b++ : (a < b ? --b : b);
        System.out.println("Output: " + c);
        System.out.println("Correct Option: d) 9");
        System.out.println("Explanation: (5 > 10) is false -> evaluates (5 < 10 ? --b : b) -> (5 < 10) is true -> --b pre-decrements b from 10 to 9.");
    }
}
