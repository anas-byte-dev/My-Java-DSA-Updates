# ⚡ Operators & Bitwise Programming

This directory contains **50 Java programs** covering arithmetic operators, conditional ternary operators, bit manipulation operations, variable swapping techniques, and output evaluation questions.

---

## 📂 Sub-folder Breakdown

### 1. [`Operators/Arithmetic`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Operators/Arithmetic) (10 Programs)
- **Q01**: Last digit, last 2 digits, remove last digit, remove last 2 digits (`n % 10`, `n / 10`, etc.)
- **Q02**: Digits extraction right-to-left
- **Q03**: Swap two numbers (with 3rd variable & without 3rd variable)
- **Q04**: Cyclic 3-variable swap (1st -> 2nd, 2nd -> 3rd, 3rd -> 1st) with & without 4th variable
- **Q05**: Cost Price & Selling Price %Profit calculation
- **Q06**: Cost Price & Selling Price %Loss calculation
- **Q07**: Add Two Integers (LeetCode 2235)
- **Q08**: Calculate Delayed Arrival Time (LeetCode 2651)
- **Q09**: Find the Maximum Achievable Number (LeetCode 2769)
- **Q10**: Account Balance After Rounded Purchase (LeetCode 2806)

### 2. [`Operators/Conditional`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Operators/Conditional) (25 Programs)
- **Q01 - Q02**: Even/Odd and 3-digit number check via ternary operator
- **Q03**: Minimum Cuts to Divide a Circle (LeetCode 2481)
- **Q04**: Find Closest Person
- **Q05 - Q07**: Divisibility by 3 & 5, factor check, triangle validity check
- **Q08**: Leap Year evaluation (HackerRank)
- **Q09 - Q16**: Min/Max comparisons among 2, 3, and 4 numbers, second largest, 3-number sorting
- **Q17 - Q25**: Tricky Java operator evaluation & precedence code tracing questions

### 3. [`Operators/Bitwise`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Operators/Bitwise) (15 Programs)
- **Bitwise AND (`&`), OR (`|`), XOR (`^`), NOT (`~`)**:
  - `5 & 3`, `10 | 6`, `12 ^ 9`, `~16`, `~(-23)`
  - Parity check via LSB (`45 & 1`, `44 & 1`)
  - Universal identities (`n | ~n = -1`, `n & ~n = 0`)
  - Two's complement properties (`18 | ~(-18)`, `18 & ~(-18)`)
- **Bit Shifts (`>>`, `<<`, `>>>`)**:
  - Signed right shift (`20 >> 2`), left shift (`20 << 2`), unsigned right shift (`20 >>> 2`)
- **Even / Odd Check**:
  - Check parity without modulus `%` operator (`(n & 1) == 0`)

---

## 🚀 How to Run

```bash
# Run arithmetic program
java Operators/Arithmetic/Q03.java

# Run conditional program
java Operators/Conditional/Q13.java

# Run bitwise program
java Operators/Bitwise/Q15.java

# Or from compiled class files:
java -cp "class_files/Operators/Arithmetic" Q03
```

👉 See [Platform_Questions.md](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Operators/Platform_Questions.md) for platform references.
