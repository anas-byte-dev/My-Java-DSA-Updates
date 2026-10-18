import java.util.Scanner;

public class Q02 {
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        return sum;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isSmith(int n) {
        if (isPrime(n) || n <= 1) return false;
        int originalSum = sumOfDigits(n);
        int factorSum = 0, temp = n;

        for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                factorSum += sumOfDigits(i);
                temp /= i;
            }
        }
        if (temp > 1) factorSum += sumOfDigits(temp);

        return originalSum == factorSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0, num = 4;

        while (true) {
            if (isSmith(num)) {
                count++;
                if (count == n) {
                    System.out.println(n + "th Smith number is: " + num);
                    break;
                }
            }
            num++;
        }
        sc.close();
    }
}
