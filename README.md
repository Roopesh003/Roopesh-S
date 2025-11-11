# Programming Test - First Screening

## Language Used
- Java (JDK 8 or above)

## Files Included
- `Problem1.java` — Calculator class for Addition, Subtraction, Multiplication, Division.
- `Problem2.java` — Generates the first 'a' odd numbers.
- `Problem3.java` — Generates an odd number series depending on whether `a` is odd or even.
- `Problem4.java` — Counts multiples of numbers 1 through 9 in a predefined integer array.

## How to Run
- Compile each file using: `javac ProblemX.java`
- Run each program using: `java ProblemX`
- Follow the console prompts for input in each program.

## Program Explanations

### Problem 1: Calculator
- Takes two double operands and a string operation type.
- Supports Addition, Subtraction, Multiplication, and Division.
- Includes error handling for division by zero and invalid operations.
- Prints the calculation result.

### Problem 2: First 'a' Odd Numbers
- Takes integer input `a`.
- Prints the first `a` odd numbers starting from 1.
- Outputs numbers separated by commas.

### Problem 3: Odd Number Series (Odd/Even Input)
- Takes integer input `a`.
- If `a` is even, reduces it by 1 for the series length.
- Prints an odd number series from 1 to `2a-1` with spaces.

### Problem 4: Multiples Count
- Uses a fixed array of integers (can be modified in code).
- Counts and prints how many numbers are multiples of each number from 1 to 9.
- Displays the counts in a dictionary-like output.

## Notes
- No external libraries required.
- Each program contains comments to explain logic.
- Inputs are read via standard input except for Problem 4, which uses a fixed array.
