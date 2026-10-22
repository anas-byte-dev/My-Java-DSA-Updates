# 🔄 Recursion & Backtracking Algorithms

This directory contains **23 Java programs** covering the fundamentals of recursive logic, base condition design, stack unwinding, mathematical inductions, and classic algorithmic problems.

---

## 📑 Problem Index

| File | Problem Title & Description | Key Concept | Time | Space |
|---|---|---|:---:|:---:|
| [`Q01.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q01.java) | Print 1 to N | Tail Recursion / Base Case | $O(N)$ | $O(N)$ |
| [`Q02.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q02.java) | Print N to 1 | Pre-recursion output | $O(N)$ | $O(N)$ |
| [`Q03.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q03.java) | Sum of First N Natural Numbers | Mathematical induction ($N + f(N-1)$) | $O(N)$ | $O(N)$ |
| [`Q04.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q04.java) | Factorial of a Number | Base Case ($0! = 1$) | $O(N)$ | $O(N)$ |
| [`Q05.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q05.java) | Power Function ($a^b$) | Exponent reduction ($a \cdot a^{b-1}$) | $O(B)$ | $O(B)$ |
| [`Q06.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q06.java) | Optimized Power ($a^b$) | Binary Exponentiation ($O(\log B)$) | $O(\log B)$ | $O(\log B)$ |
| [`Q07.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q07.java) | Count Digits | Digit truncation via recursion | $O(\log_{10} N)$ | $O(\log_{10} N)$ |
| [`Q08.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q08.java) | Sum of Digits | Modular extraction | $O(\log_{10} N)$ | $O(\log_{10} N)$ |
| [`Q09.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q09.java) | Product of Digits | Base check on remaining digit | $O(\log_{10} N)$ | $O(\log_{10} N)$ |
| [`Q10.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q10.java) | Reverse a Number | Recursive accumulator helper | $O(\log_{10} N)$ | $O(\log_{10} N)$ |
| [`Q11.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q11.java) | Palindrome Number | Symmetric recursive check | $O(\log_{10} N)$ | $O(\log_{10} N)$ |
| [`Q12.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q12.java) | Count Zero Digits | Conditional counting step | $O(\log_{10} N)$ | $O(\log_{10} N)$ |
| [`Q13.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q13.java) | GCD (Euclidean Algorithm) | $gcd(b, a \% b)$ | $O(\log(\min(A, B)))$ | $O(\log(\min(A, B)))$ |
| [`Q14.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q14.java) | LCM of Two Numbers | Reduction via GCD formula | $O(\log(\min(A, B)))$ | $O(\log(\min(A, B)))$ |
| [`Q15.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q15.java) | Check Sorted Array | Array index induction | $O(N)$ | $O(N)$ |
| [`Q16.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q16.java) | Linear Search (Recursive) | Head/Tail list recursion | $O(N)$ | $O(N)$ |
| [`Q17.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q17.java) | N-th Fibonacci Number | Multiple branches (LeetCode 509) | $O(2^N)$ | $O(N)$ |
| [`Q18.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q18.java) | Power of Two | Recursive division by 2 (LeetCode 231) | $O(\log N)$ | $O(\log N)$ |
| [`Q19.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q19.java) | Tower of Hanoi | 3-peg recursive transfer | $O(2^N)$ | $O(N)$ |
| [`Q20.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q20.java) | Reverse a String | 2-pointer recursive swap (LeetCode 344) | $O(N)$ | $O(N)$ |
| [`Q21.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q21.java) | Climbing Stairs | Overlapping subproblems (LeetCode 70) | $O(2^N)$ | $O(N)$ |
| [`Q22.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q22.java) | Subsets / Power Set | Backtracking pick/skip (LeetCode 78) | $O(2^N)$ | $O(N)$ |
| [`Q23.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Q23.java) | Binary Search (Recursive) | Search interval halving | $O(\log N)$ | $O(\log N)$ |

---

## 🚀 How to Run

```bash
# Run any recursive program directly:
java Recursion/Q19.java    # Tower of Hanoi
java Recursion/Q22.java    # Subsets (Power Set)

# Or run from compiled class files:
java -cp "class_files/Recursion" Q19
```

👉 See [Platform_Questions.md](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Recursion/Platform_Questions.md) for platform references.
