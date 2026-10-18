# 📦 Array Data Structure & Algorithms

This directory contains 25 foundational and interview-essential Java implementations covering linear arrays, 2D matrices, two-pointer techniques, sorting partitions, prefix products, and sliding window patterns.

---

## 📑 Problem Index

| File | Problem Title & Description | Key Algorithm / Approach | Time | Space |
|---|---|---|:---:|:---:|
| [`Q01.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q01.java) | Elements at Even Index | Index-based traversal (`i += 2`) | $O(N)$ | $O(1)$ |
| [`Q02.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q02.java) | Even Elements in Array | Parity check (`val % 2 == 0`) | $O(N)$ | $O(1)$ |
| [`Q03.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q03.java) | Odd Elements in Array | Parity check (`val % 2 != 0`) | $O(N)$ | $O(1)$ |
| [`Q04.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q04.java) | Elements Divisible by 5 | Modular check (`val % 5 == 0`) | $O(N)$ | $O(1)$ |
| [`Q05.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q05.java) | Reverse Array Traversal | Right-to-left loop (`n - 1` down to `0`) | $O(N)$ | $O(1)$ |
| [`Q06.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q06.java) | Sum of All Array Elements | Accumulator loop | $O(N)$ | $O(1)$ |
| [`Q07.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q07.java) | Maximum & Minimum in Array | Single-pass min/max tracking | $O(N)$ | $O(1)$ |
| [`Q08.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q08.java) | Two Sum | Hash Map / Complement lookup (LeetCode 1) | $O(N)$ | $O(N)$ |
| [`Q09.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q09.java) | Linear Search | Sequential search | $O(N)$ | $O(1)$ |
| [`Q10.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q10.java) | Binary Search | Divide & Conquer on sorted array | $O(\log N)$ | $O(1)$ |
| [`Q11.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q11.java) | Count Frequency of Elements | Frequency tracking via HashMap | $O(N)$ | $O(N)$ |
| [`Q12.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q12.java) | Single Number | Bitwise XOR cancellation (LeetCode 136) | $O(N)$ | $O(1)$ |
| [`Q13.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q13.java) | Missing Number | Arithmetic Gauss Sum / XOR (LeetCode 268) | $O(N)$ | $O(1)$ |
| [`Q14.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q14.java) | Contains Duplicate | HashSet lookup (LeetCode 217) | $O(N)$ | $O(N)$ |
| [`Q15.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q15.java) | Rotate Array by K steps | Three-reversal algorithm (LeetCode 189) | $O(N)$ | $O(1)$ |
| [`Q16.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q16.java) | Move Zeroes to End | Two-pointer partition (LeetCode 283) | $O(N)$ | $O(1)$ |
| [`Q17.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q17.java) | Remove Duplicates from Sorted | Two pointers in-place (LeetCode 26) | $O(N)$ | $O(1)$ |
| [`Q18.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q18.java) | Sort Colors (0s, 1s, 2s) | Dutch National Flag algorithm (LeetCode 75) | $O(N)$ | $O(1)$ |
| [`Q19.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q19.java) | Maximum Subarray Sum | Kadane's Algorithm (LeetCode 53) | $O(N)$ | $O(1)$ |
| [`Q20.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q20.java) | Merge Sorted Array | Backward 3-pointer merge (LeetCode 88) | $O(M+N)$ | $O(1)$ |
| [`Q21.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q21.java) | Best Time to Buy and Sell Stock | Single-pass min-price tracker (LeetCode 121) | $O(N)$ | $O(1)$ |
| [`Q22.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q22.java) | Majority Element (> n/2) | Boyer-Moore Voting Algorithm (LeetCode 169) | $O(N)$ | $O(1)$ |
| [`Q23.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q23.java) | Product of Array Except Self | Left & Right prefix products (LeetCode 238) | $O(N)$ | $O(1)$ |
| [`Q24.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q24.java) | Find Disappeared Numbers | Index sign marking (LeetCode 448) | $O(N)$ | $O(1)$ |
| [`Q25.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Q25.java) | Rotate Image (Matrix 90°) | Matrix Transpose + Row Reverse (LeetCode 48) | $O(N^2)$ | $O(1)$ |

---

## 🚀 How to Run

```bash
# Direct run with Java 11+
java Array/Q08.java

# Or from compiled class files
java -cp "class_files/Array" Q08
```

👉 See [Platform_Questions.md](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Array/Platform_Questions.md) for direct platform references and links.
