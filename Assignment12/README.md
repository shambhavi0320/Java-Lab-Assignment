# Assignment 12: Insertion Sort

**Experiment Title:** Insertion Sort

**Aim:** Sort small arrays with insertion sort and count how many values are shifted.

**Software / Tools Required:** Java Development Kit (JDK), Visual Studio Code (VS Code), and a terminal/command prompt.

**Theory:** Insertion sort builds a sorted part of the array one element at a time. Each new value is inserted into its correct position.

Insertion sort compares the key with previous elements and shifts larger values to the right until the correct position is found.

A shift happens when an element moves one position to the right to make space for the key. A counter records every such movement.

## Question 1: Sort an Array Using Insertion Sort

**Algorithm / Procedure:**

130. Create the array {7, 3, 5, 1}.
131. Start from the second element and store it as key.
132. Shift larger elements one position to the right.
133. Insert key and print the sorted array.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Sorted: [1, 3, 5, 7]
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 2: Sort Another Array Using Insertion Sort

**Algorithm / Procedure:**

134. Create the array {14, 3, 9, 21, 6}.
135. Apply insertion sort using a key and a shifting loop.
136. Insert each key into its correct position.
137. Print the sorted array.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Sorted: [3, 6, 9, 14, 21]
```

**Result:**

The program was written to perform the required task and produces the output shown above.

## Question 3: Count Shifts in Insertion Sort

**Algorithm / Procedure:**

138. Create the array {6, 5, 4, 3, 2, 1}.
139. Initialize shifts to 0.
140. Perform insertion sort and increase shifts each time an element is moved right.
141. Print the total shifts.

**Input:**

No runtime input required. The values are predefined in the program as specified in the question.

**Output:**

```text
Shifts: 15
```

**Result:**

The program was written to perform the required task and produces the output shown above.
