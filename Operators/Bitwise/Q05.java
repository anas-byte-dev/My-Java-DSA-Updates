// Q5: What is the value of the expression ~-23?
// Options: a) -24  b) 24  c) -22  d) 22
// Answer: d) 22
public class Q05 {
    public static void main(String[] args) {
        int res = ~-23;
        System.out.println("~(-23) = " + res);
        System.out.println("Formula: ~n = -(n + 1) -> -(-23 + 1) = 22");
    }
}
