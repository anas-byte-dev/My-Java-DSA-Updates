// Q10: What is the value of the expression 18 | ~(-18)?
public class Q10 {
    public static void main(String[] args) {
        int res = 18 | ~(-18);
        System.out.println("18 | ~(-18) = " + res);
        System.out.println("~(-18) = 17. Binary: 18 (10010) | 17 (10001) = 10011 (19).");
    }
}
