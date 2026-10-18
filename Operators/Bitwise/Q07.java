// Q7: What is the value of the expression 44 & 1?
// Options: a) 1  b) 0  c) -1  d) none
// Answer: b) 0 (Least Significant Bit of even number is 0)
public class Q07 {
    public static void main(String[] args) {
        int res = 44 & 1;
        System.out.println("44 & 1 = " + res);
        System.out.println("44 is even, so its LSB is 0. Thus 44 & 1 = 0.");
    }
}
