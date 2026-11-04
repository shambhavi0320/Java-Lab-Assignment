# Assignment 3: Star and Number Patterns

**Experiment Title:** Star and Number Patterns

**Aim:** Star and Number Patterns

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** Nested loops are loops placed inside another loop. The outer loop controls rows and the inner loop prints columns.

A nested loop can print a triangle by changing the number of inner-loop repetitions for each row.

The inner loop prints numbers from 1 up to the current row number. This creates a growing number triangle.

The number of stars decreases in every row. The inner loop runs from 4 down to the current row number.

## Question 1: Square Pattern of Stars

**Algorithm / Procedure:**

29. Run the outer loop for 4 rows.
30. For each row, run the inner loop 4 times.
31. Print a star in each column and move to the next line after each row.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
****
****
****
****
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Right Triangle Pattern of Stars

**Algorithm / Procedure:**

32. Run the outer loop from 1 to 4.
33. For each row i, print i stars using the inner loop.
34. Move to the next line after each row.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
*
**
***
****
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Number Triangle Pattern

**Algorithm / Procedure:**

35. Run the outer loop from 1 to 4.
36. For each row, print numbers from 1 to i.
37. Print a space after each number.
38. Move to the next line.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
1
1 2
1 2 3
1 2 3 4
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 4: Upside-Down Triangle of Stars

**Algorithm / Procedure:**

39. Run the outer loop from 4 down to 1.
40. Print i stars in each row using the inner loop.
41. Move to the next line after each row.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
****
***
**
*
```

**Result:**

The program was written to perform the required task and produces the output shown above.
