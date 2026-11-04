# Assignment 8: Matrices: Transpose and Row Sums

**Experiment Title:** Matrices: Transpose and Row Sums

**Aim:** Create two-dimensional arrays, visit them row by row, and build a new matrix from one.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** A two-dimensional array stores values in rows and columns. Nested loops can fill and display matrix elements.

The transpose of a matrix is formed by interchanging its rows and columns. Element at m[i][j] becomes t[j][i].

Each row sum is calculated by adding all elements in that row. The outer loop selects a row and the inner loop adds its elements.

## Question 1: Create and Print a 3 by 4 Matrix

**Algorithm / Procedure:**

85. Create a 3 by 4 integer matrix.
86. Use nested loops to fill it with values from 1 to 12 row by row.
87. Use nested loops to print each row.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
1 2 3 4
5 6 7 8
9 10 11 12
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Find the Transpose of a Matrix

**Algorithm / Procedure:**

88. Create the given 3 by 3 matrix.
89. Create another 3 by 3 matrix for the transpose.
90. Copy each element from m[i][j] to t[j][i].
91. Print the transpose row by row.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
1 4 7
2 5 8
3 6 9
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Find the Sum of Each Matrix Row

**Algorithm / Procedure:**

92. Create the given 3 by 3 matrix.
93. For each row, initialize sum to 0.
94. Add all elements of that row using an inner loop.
95. Print the sum of each row.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

**Result:**

The program was written to perform the required task and produces the output shown above.
