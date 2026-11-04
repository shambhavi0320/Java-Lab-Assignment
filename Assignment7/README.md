# Assignment 7: Counting Steps and Complexity

**Experiment Title:** Counting Steps and Complexity

**Aim:** Count the steps a program takes, and write its time complexity as a comment.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** A single loop that runs n times has linear time complexity, written as O(n). Here, the loop runs 10 times.

Two nested loops, each running n times, execute the inner body n × n times. Their time complexity is O(n^2).

Repeatedly dividing a number by 2 reduces it exponentially. The number of divisions is logarithmic, so the time complexity is O(log n).

## Question 1: Count Steps in a Single Loop

**Algorithm / Procedure:**

73. Initialize steps to 0.
74. Write the time complexity comment above the loop.
75. Run the loop from 1 to 10 and increase steps each time.
76. Print the step count.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Steps: 10
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Count Steps in Nested Loops

**Algorithm / Procedure:**

77. Initialize steps to 0.
78. Write the time complexity comment above the loops.
79. Use two nested loops from 1 to 10.
80. Increase steps in the inner loop and print the count.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Steps: 100
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Count Halving Steps

**Algorithm / Procedure:**

81. Store 1024 in n and initialize steps to 0.
82. Write the time complexity comment above the while loop.
83. While n is greater than 1, divide n by 2 and increase steps.
84. Print the number of halving steps.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Halving steps: 10
```

**Result:**

The program was written to perform the required task and produces the output shown above.
