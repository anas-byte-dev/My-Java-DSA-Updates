public class Q02 {
    static void print10To1(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        print10To1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Numbers 10 to 1 using recursion:");
        print10To1(10);
        System.out.println();
    }
}
