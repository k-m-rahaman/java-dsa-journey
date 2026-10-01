# 16 - Bit Manipulation

Bit manipulation is the technique of working directly with the binary representation of numbers using bitwise operators.

## Topics Covered

### Basic Bit Manipulation

- Binary Representation
- Count Set Bits
- Power of Two
- Odd or Even Check

### XOR Techniques

- Single Number
- Missing Number
- Swap Without Temporary Variable
- Reverse Bits
- Find Two Unique Numbers

### Individual Bit Operations

- Get Bit
- Set Bit
- Clear Bit
- Toggle Bit
- Update Bit
- Power of Two Bit Trick

### Advanced Bit Manipulation

- Add Without Plus
- Subtract Without Minus
- XOR Range
- Gray Code
- Missing and Repeating Number
- Divide Without Division

### Interview-Level Problems

- Power Set Using Bits
- Bit Palindrome
- Next Power of Two
- Maximum XOR Pair
- Count Bits From 1 to N

## Important Operators

| Operator | Meaning |
|----------|---------|
| `&` | AND |
| `|` | OR |
| `^` | XOR |
| `~` | NOT |
| `<<` | Left Shift |
| `>>` | Signed Right Shift |
| `>>>` | Unsigned Right Shift |

## Key Bit Tricks

```text
Check odd:
n & 1

Check power of two:
n > 0 && (n & (n - 1)) == 0

Remove lowest set bit:
n & (n - 1)

Get lowest set bit:
n & -n

Set a bit:
n | (1 << position)

Clear a bit:
n & ~(1 << position)

Toggle a bit:
n ^ (1 << position)

Complexity

Most basic bit operations take:

Time: O(1)

Many bit manipulation algorithms run in:

Time: O(log N)

depending on the number of bits processed.

Goal

The goal of this module is to understand how numbers are represented in binary and how bitwise operations can be used to solve problems efficiently.

```
---

# 📁 FINAL MODULE STRUCTURE

```text
16-Bit-Manipulation/
│
├── README.md
│
├── BinaryRepresentation.java
├── CountSetBits.java
├── PowerOfTwo.java
├── OddEvenCheck.java
│
├── SingleNumber.java
├── MissingNumber.java
├── SwapWithoutTemp.java
├── ReverseBits.java
├── FindUniqueNumbers.java
│
├── GetBit.java
├── SetBit.java
├── ClearBit.java
├── ToggleBit.java
├── UpdateBit.java
├── CheckBitPower.java
│
├── AddWithoutPlus.java
├── SubtractWithoutMinus.java
├── XORRange.java
├── GrayCode.java
├── FindMissingAndRepeating.java
├── DivideWithoutDivision.java
│
├── PowerSetUsingBits.java
├── IsBitPalindrome.java
├── NextPowerOfTwo.java
├── MaximumXORPair.java
└── CountBitsFromOneToN.java

```