# 🔀 Flow Control & Conditional Statements

This directory contains **9 Java implementations** demonstrating if-else branching logic, multi-condition ladders, geometric classification, and mathematical business rules.

---

## 📑 Problem Index

| File | Problem Title & Description | Key Logic |
|---|---|---|
| [`Q01.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q01.java) | Bigger of Two Numbers | Simple binary if-else decision |
| [`Q02.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q02.java) | All Equal or Maximum of Three | Equality check `(a == b && b == c)` vs max value tracking |
| [`Q03.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q03.java) | Check Character is Alphabet | Range check `(ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')` |
| [`Q04.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q04.java) | Triangle Validity by Angles | Sum of internal angles equals $180^\circ$ and all angles $> 0$ |
| [`Q05.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q05.java) | Triangle Validity by Sides | Triangle Inequality Theorem: $a+b>c$, $b+c>a$, $a+c>b$ |
| [`Q06.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q06.java) | Equilateral, Isosceles or Scalene | Side equality branching logic |
| [`Q07.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q07.java) | Leap Year Check | Gregorian calendar leap rule: `year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)` |
| [`Q08.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q08.java) | Profit or Loss Percentage | Commercial math: $SP > CP \implies Profit$, $CP > SP \implies Loss$ |
| [`Q09.java`](file:///c:/Users/ANAS%20SIDDIQUI/Desktop/DSA%20Q/Flow%20Control/Q09.java) | Tiered Shopping Discount | Tiered discount calculation ($\ge 10000 \to 40\%$, $\ge 6000 \to 30\%$, etc.) |

---

## 🚀 How to Run

```bash
# Run any flow control program directly with Java 11+
java "Flow Control/Q05.java"    # Triangle validity
java "Flow Control/Q09.java"    # Shopping discount

# Or from compiled class files:
java -cp "class_files/Flow Control" Q05
```
