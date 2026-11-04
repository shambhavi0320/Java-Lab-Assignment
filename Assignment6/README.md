# Assignment 6: Arrays: Reverse and Duplicates

**Experiment Title:** Arrays: Reverse and Duplicates

**Aim:** Print an array in reverse order, find the smallest value, and check an array for repeated values.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** Array elements can be accessed from the last index to the first index. The last index is arr.length - 1.

The smallest value can be found by comparing each element with a variable that stores the current minimum. Its index is updated when a smaller value is found.

Nested loops compare each array element with the elements that come after it. If two values are equal, a repeated value is found.

## Question 1: Print an Array in Reverse Order

**Algorithm / Procedure:**

62. Create the array {10, 20, 30, 40, 50}.
63. Run a loop from the last index down to 0.
64. Print each element on a separate line.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
50
40
30
20
10
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Find the Smallest Value and Its Index

**Algorithm / Procedure:**

65. Create the array {2, 5, 1, 8, 3, 4}.
66. Initialize smallest with the first element and its index with 0.
67. Compare each element and update the value and index when needed.
68. Print the smallest value and its index.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Smallest: 1 at index 2
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Check for Repeated Values

**Algorithm / Procedure:**

69. Create the array {4, 9, 2, 9, 7}.
70. Use an outer loop and an inner loop starting at i + 1.
71. Compare the two values and record a match.
72. Print the repeated value, or print No repeated value if none is found.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Repeated value: 9
```

**Result:**

The program was written to perform the required task and produces the output shown above.
