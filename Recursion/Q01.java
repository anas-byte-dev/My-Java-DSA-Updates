public class Q01 {
    static void print1To10(int n) {
        if (n > 10) return;
        System.out.print(n + " ");
        print1To10(n + 1);
    }

    public static void main(String[] args) {
        System.out.println("Numbers 1 to 10 using recursion:");
        print1To10(1);
        System.out.println();
    }
}
